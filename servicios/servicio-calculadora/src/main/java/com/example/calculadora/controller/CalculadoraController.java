package com.example.calculadora.controller;

import com.example.calculadora.dto.CalculadoraRequestDTO;
import com.example.calculadora.dto.CalculadoraResponseDTO;
import com.example.calculadora.service.CalcularCuotaService;

import co.com.santander.serviciosexternos.client.AccesoDatosCalculadoraClient;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.AliadoDTO;
import co.com.santander.serviciosexternos.objetoscomunes.enumerado.ClientesServiciosEnum;
import co.com.santander.serviciosexternos.objetoscomunes.utils.LoggerMessages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class CalculadoraController {

    @Autowired
    CalcularCuotaService calcularCuotaService;
    
    @Autowired
    AccesoDatosCalculadoraClient accesoDatosCalculadoraClient;
    
    private final String ENDPOINT_CALCULO_CUOTAS = "/calculoCuotas";
    private final String ENDPOINT_CONSULTAR_ALIADO = "/consultarAliado";

    @RequestMapping(value = ENDPOINT_CALCULO_CUOTAS, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CalculadoraResponseDTO calculoCuotas(@RequestBody CalculadoraRequestDTO request) {
    	LoggerMessages.generateInitialLogSimple(ClientesServiciosEnum.ACCESO_DATOS_CALCULADORA, ENDPOINT_CALCULO_CUOTAS);
        if(request != null && request.getValorSolicitado() > 0 && request.getCantidadCuotas() >0)
            return calcularCuotaService.calcularCuotas(request);
        else
            return new CalculadoraResponseDTO();
    }

    @RequestMapping(value = ENDPOINT_CONSULTAR_ALIADO, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public AliadoDTO consultarAliado(@RequestParam("nombreUsuario") String nombreUsuario) {
    	LoggerMessages.generateInitialLogSimple(ClientesServiciosEnum.ACCESO_DATOS_CALCULADORA, ENDPOINT_CONSULTAR_ALIADO);
        return accesoDatosCalculadoraClient.getAliado(nombreUsuario);
    }
}
