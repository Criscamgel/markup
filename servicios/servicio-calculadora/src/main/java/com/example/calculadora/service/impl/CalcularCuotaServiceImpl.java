package com.example.calculadora.service.impl;

import com.example.calculadora.config.ObjCacheManager;
import com.example.calculadora.dto.CalculadoraRequestDTO;
import com.example.calculadora.dto.CalculadoraResponseDTO;
import com.example.calculadora.service.CalcularCuotaService;
import com.example.calculadora.utils.CalculosUtil;
import com.example.calculadora.utils.Constants;

import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.ParametroDTO;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Service
public class CalcularCuotaServiceImpl implements CalcularCuotaService {

    @SuppressWarnings("unchecked")
	@Override
    public CalculadoraResponseDTO calcularCuotas(CalculadoraRequestDTO request) {
        CalculadoraResponseDTO response = new CalculadoraResponseDTO();
        try {
            ObjCacheManager cacheManager = new ObjCacheManager();
            List<ParametroDTO> parametroDTOList = (List<ParametroDTO>) cacheManager.retrieveFromCache(request.getAliadoId());
            double tasa;
            switch (request.getCantidadCuotas()){
                case 6:
                    tasa = calcularTasa(request, parametroDTOList, request.getCantidadCuotas());
                    response = calculosDescuentosPagos(request, calcularDescuentoPorCuota(6, parametroDTOList), tasa , response);
                    break;
                case 12:
                    tasa = calcularTasa(request, parametroDTOList, request.getCantidadCuotas());
                    response = calculosDescuentosPagos(request, calcularDescuentoPorCuota(12, parametroDTOList), tasa,response);
                    break;
                case 18:
                    tasa = calcularTasa(request, parametroDTOList, request.getCantidadCuotas());
                    response = calculosDescuentosPagos(request, calcularDescuentoPorCuota(18, parametroDTOList), tasa,response);
                    break;
                case 24:
                    tasa = calcularTasa(request, parametroDTOList, request.getCantidadCuotas());
                    response = calculosDescuentosPagos(request, calcularDescuentoPorCuota(24, parametroDTOList), tasa,response);
                    break;
                case 36:
                    tasa = calcularTasa(request, parametroDTOList, request.getCantidadCuotas());
                    response = calculosDescuentosPagos(request, calcularDescuentoPorCuota(36, parametroDTOList), tasa ,response);
                    break;
                default:
                    break;
            }
        }catch (Exception ex){
            System.out.println("Error en los parametros para calcular la cuota: "+ex.getMessage());
        }
        return response;
    }

    private CalculadoraResponseDTO calculosDescuentosPagos(CalculadoraRequestDTO request, double descuentoPorCuota, double tasa, CalculadoraResponseDTO response){
        response.setValorConDescuento(request.getDescuento() >0 ? request.getValorSolicitado()-(request.getValorSolicitado()* (request.getDescuento()/100.0)):
                request.getValorSolicitado());
        if(descuentoPorCuota >0){
            response.setValorConDescuento( Math.round(response.getValorConDescuento() - Math.round(response.getValorConDescuento() * descuentoPorCuota)) );
        }
        switch (request.getAliadoId()) {
            case Constants.ID_COLSANITAS:
                response.setValorTotalSeguro(CalculosUtil.calcularValorTotalSeguro(response.getValorConDescuento(), request.getCantidadCuotas()));
                response.setValorCuotaSinSeguro(CalculosUtil.calcularPago(response.getValorConDescuento(), request.getCantidadCuotas(),tasa));
                response.setCostoMensualSeguro(CalculosUtil.calcularPago(response.getValorTotalSeguro(), request.getCantidadCuotas(), tasa));
                response.setValorCuotaConSeguro(response.getValorCuotaSinSeguro()+response.getCostoMensualSeguro());
                response.setMontoTotalFinanciamiento(Math.round(response.getValorConDescuento() + response.getValorTotalSeguro()) );
                break;
            case Constants.ID_GAES:
                response.setCuotaInicial(Math.round(response.getValorConDescuento() * 0.10));
                response.setValorSinCuotaInicial(response.getValorConDescuento() - response.getCuotaInicial());
                response.setValorTotalSeguro(CalculosUtil.calcularValorTotalSeguro(response.getValorSinCuotaInicial(), request.getCantidadCuotas()));
                response.setCuatroxMil(CalculosUtil.calcularCuatroxMil(response.getValorSinCuotaInicial(),response.getValorTotalSeguro()));
                response.setCuotaMensualSinInicial(Math.round(request.getCantidadCuotas() >0 ? response.getValorSinCuotaInicial() / request.getCantidadCuotas() : 0));
                double pagoCuatroxMil = CalculosUtil.calcularPagoCuatroxMil(response.getCuotaMensualSinInicial(), request.getCantidadCuotas(), tasa);
                response.setCostoInteres( (response.getValorSinCuotaInicial()+response.getValorTotalSeguro()+response.getCuatroxMil() )-pagoCuatroxMil );
                response.setDescuentoFinanciacion(new BigDecimal(response.getValorSinCuotaInicial() > 0 ? response.getCostoInteres() / response.getValorSinCuotaInicial() *100 : 0)
                        .setScale(2, RoundingMode.HALF_EVEN));
                response.setCostoGaes(new BigDecimal(request.getValorSolicitado() > 0 ? response.getCostoInteres()/ request.getValorSolicitado() * 100 : 0)
                        .setScale(2, RoundingMode.HALF_EVEN));
                response.setCostoTotalGaes(response.getCostoGaes()+10);
                response.setMontoTotalFinanciamiento(Math.round(request.getValorSolicitado() + response.getValorTotalSeguro()));
                response.setValorSinCuotaInicialNiDescuento( request.getValorSolicitado() - (request.getValorSolicitado() * 0.10) );
                break;
            default:
                break;
        }
        return response;
    }

    private double calcularTasa(CalculadoraRequestDTO request, List<ParametroDTO> parametroDTOList, Integer cuotas) {
        double tasa = 0.0;
        if (parametroDTOList != null && parametroDTOList.size() > 0) {
            for (ParametroDTO param : parametroDTOList) {
                switch (request.getAliadoId()) {
                    case Constants.ID_COLSANITAS:
                        if (cuotas == 36) {
                            if (param.getTipo().equalsIgnoreCase("tasa") && (request.isEpsPrepagada() ||
                                    param.getNombre().toLowerCase().contains(Constants.CUOTA_36))) {
                                if (request.isEpsPrepagada()) {
                                    if (param.getNombre().toLowerCase().contains("prepagada")) {
                                        tasa = param.getValorNumerico();
                                        break;
                                    }
                                } else if (!param.getNombre().toLowerCase().contains("prepagada")) {
                                    tasa = param.getValorNumerico();
                                    break;
                                }
                            }
                        } else {
                            if (param.getTipo().equalsIgnoreCase("tasa") && !param.getNombre().toLowerCase().contains(Constants.CUOTA_36)) {
                                if (request.isEpsPrepagada()) {
                                    if (param.getNombre().toLowerCase().contains("prepagada")) {
                                        tasa = param.getValorNumerico();
                                        break;
                                    }
                                } else if (!param.getNombre().toLowerCase().contains("prepagada")) {
                                    tasa = param.getValorNumerico();
                                    break;
                                }
                            }
                        }
                        break;
                    case Constants.ID_GAES:
                        if (param.getTipo().equalsIgnoreCase("tasa")) {
                            tasa = param.getValorNumerico();
                            break;
                        }
                    default:
                        break;
                }
            }
        }
        return tasa;
    }

    private double calcularDescuentoPorCuota(int cuota,  List<ParametroDTO> parametroDTOList){
        double descuento = 0;
        if(parametroDTOList != null && parametroDTOList.size() >0){
            for (ParametroDTO param: parametroDTOList) {
                if(param.getTipo().equalsIgnoreCase("descuento") && param.getNombre().contains(String.valueOf(cuota))){
                    descuento = param.getValorNumerico();
                }
            }
        }
        return descuento;
    }
}
