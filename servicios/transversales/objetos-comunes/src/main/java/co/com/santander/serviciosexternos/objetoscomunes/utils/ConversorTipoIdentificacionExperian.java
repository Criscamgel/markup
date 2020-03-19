/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.santander.serviciosexternos.objetoscomunes.utils;

import co.com.santander.serviciosexternos.objetoscomunes.enumerado.TipoIdentificacionEnum;

/**
 *
 * @author gustavocastro
 */
public class ConversorTipoIdentificacionExperian {
    
    public static Integer convertirTipoIdentificacion(Integer idTipoIdentificacion){
        Integer tipoIdentificacion=null;
        TipoIdentificacionEnum tipoIdentificacionEnum=TipoIdentificacionEnum.obtenerTipoIdentificacionXId(idTipoIdentificacion);
        if(tipoIdentificacionEnum!=null){
            if(TipoIdentificacionEnum.NI.equals(tipoIdentificacionEnum)){
                tipoIdentificacion=2;
            }
            if(TipoIdentificacionEnum.CE.equals(tipoIdentificacionEnum)){
                tipoIdentificacion=4;
            }
        }
        if(tipoIdentificacion==null){
            tipoIdentificacion=idTipoIdentificacion;
        }
        
        return tipoIdentificacion;
    }
    
}
