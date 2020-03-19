package co.com.santander.serviciosexternos.objetoscomunes.dto.parametroservicio;

import java.io.Serializable;
import java.util.List;


public class ParametroServicioDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String nombre;

    private String valor;

    private boolean parametroPadre;

    private List<ParametroServicioDTO> parametrosHijos;

    public List<ParametroServicioDTO> getParametrosHijos() {
        return parametrosHijos;
    }

    public void setParametrosHijos(List<ParametroServicioDTO> parametrosHijos) {
        this.parametrosHijos = parametrosHijos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isParametroPadre() {
        return parametroPadre;
    }

    public void setParametroPadre(boolean parametroPadre) {
        this.parametroPadre = parametroPadre;
    }
}
