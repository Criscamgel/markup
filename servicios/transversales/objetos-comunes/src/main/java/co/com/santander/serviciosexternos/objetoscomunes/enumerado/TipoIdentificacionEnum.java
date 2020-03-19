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
public enum TipoIdentificacionEnum {
    CC(1),
    CE(2),
    NI(3);
    
    private Integer idTipoIdentificacion;
    
    TipoIdentificacionEnum(Integer idTipoIdentificacion){
        this.idTipoIdentificacion=idTipoIdentificacion;
    }
    
    public static TipoIdentificacionEnum obtenerTipoIdentificacionXId(Integer idTipoIdentificacion){
        for(TipoIdentificacionEnum tipoIdentificacionEnum:TipoIdentificacionEnum.values()){
            if(tipoIdentificacionEnum.getIdTipoIdentificacion().equals(idTipoIdentificacion)){
                return tipoIdentificacionEnum;
            }
        }
        return null;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }
    
    
    
}
