package co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora;

import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.AliadoDTO;
import java.io.Serializable;

import lombok.Data;

/**
 * 
 * @author brian.gomez
 *
 */
@Data
public class ParametroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nombre;

	private String tipo;

	private double valorNumerico;

	private String valorTexto;

	private boolean activo;

	private AliadoDTO aliado;

	public ParametroDTO() {

	}

	public ParametroDTO(String nombre, String tipo, double valorNumerico, String valorTexto) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.valorNumerico = valorNumerico;
		this.valorTexto = valorTexto;
	}
}
