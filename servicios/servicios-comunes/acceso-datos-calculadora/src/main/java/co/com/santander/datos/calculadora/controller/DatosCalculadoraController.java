package co.com.santander.datos.calculadora.controller;

import co.com.santander.datos.calculadora.entity.Aliado;
import co.com.santander.datos.calculadora.mapper.AliadoMapper;
import co.com.santander.datos.calculadora.repository.AliadoRepository;
import co.com.santander.datos.calculadora.repository.UsuarioRepository;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.AliadoDTO;
import co.com.santander.serviciosexternos.objetoscomunes.enumerado.ClientesServiciosEnum;
import co.com.santander.serviciosexternos.objetoscomunes.utils.LoggerMessages;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author brian.gomez
 *
 */
@RestController
@CrossOrigin(origins = "*")
public class DatosCalculadoraController {
	
    @Autowired
    AliadoRepository aliadoRepository;
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @Autowired
    AliadoMapper aliadoMapper;

	private final String ENDPOINT_FIND_ALL_ALIADOS = "/findAllAliados";
	private final String ENDPOINT_FIND_ALIADO = "/findAliado";

	@ResponseBody
	@RequestMapping(value = ENDPOINT_FIND_ALL_ALIADOS, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AliadoDTO> getAliados() {
		// Log of simple controller
		LoggerMessages.generateInitialLogSimple(ClientesServiciosEnum.ACCESO_DATOS_CALCULADORA, ENDPOINT_FIND_ALL_ALIADOS);
		List<Aliado> aliados = aliadoRepository.findAll();
		return aliados.isEmpty() ? new ArrayList<>() : aliadoMapper.listAliadosEntitiesToDTOs(aliados);
	}
	
	@ResponseBody
	@RequestMapping(value = ENDPOINT_FIND_ALIADO, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public AliadoDTO getAliado(@RequestParam("nombreUsuario") String nombreUsuario) {
		// Log of simple controller
		LoggerMessages.generateInitialLogSimple(ClientesServiciosEnum.ACCESO_DATOS_CALCULADORA, ENDPOINT_FIND_ALIADO);
		AliadoDTO aliadoDTO = new AliadoDTO();
		Optional<Aliado> aliadoEncontrado = usuarioRepository.findByNombreUsuario(nombreUsuario);
        if(aliadoEncontrado.isPresent()) {
            aliadoDTO.setId(aliadoEncontrado.get().getId());
            aliadoDTO.setNombreAliado(aliadoEncontrado.get().getNombreAliado());
        }
        return aliadoDTO;
	}

}
