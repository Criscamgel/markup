/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.santander.serviciosexternos.objetoscomunes.enumerado;

/**
 *
 * @author gustavocastro
 */
public enum CodigoRespuestaEnum {
    
    OK(1),
    ERROR_CONTROLADO(2),
    ERROR_TECNICO(3);
    
    private Integer idCodigoRespuesta;
    
    CodigoRespuestaEnum(Integer idCodigoRespuesta){
        this.idCodigoRespuesta=idCodigoRespuesta;
    }
    

    public Integer getIdCodigoRespuesta() {
        return idCodigoRespuesta;
    }

    public void setIdCodigoRespuesta(Integer idCodigoRespuesta) {
        this.idCodigoRespuesta = idCodigoRespuesta;
    }
    
    
}
