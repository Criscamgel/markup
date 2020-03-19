package co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import lombok.Data;

/**
 * 
 * @author brian.gomez
 *
 */
@Data
public class AliadoDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String nombreAliado;

    private boolean activo;

    private Timestamp fecha;

    private UsuarioDTO usuario;

    private List<ParametroDTO> parametros;
    
}
