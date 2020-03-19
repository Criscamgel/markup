package co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora;

import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Data;

/**
 * 
 * @author brian.gomez
 *
 */
@Data
public class UsuarioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String nombreUsuario;

	private AliadoDTO aliado;

	private boolean activo;

	private Timestamp fecha;
}
