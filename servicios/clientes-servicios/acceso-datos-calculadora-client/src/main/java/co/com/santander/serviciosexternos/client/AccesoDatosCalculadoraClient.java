package co.com.santander.serviciosexternos.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.AliadoDTO;

@FeignClient(value = "acceso-datos-calculadora.service-name", url = "http://acceso-datos-calculadora-credito-consumo-dev.apps.sv-bsnc-arquitectura-openshift.itac.com.co")
public interface AccesoDatosCalculadoraClient {

	@RequestMapping(value = "/findAllAliados", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AliadoDTO> getAliados();

	@RequestMapping(value = "/findAliado", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public AliadoDTO getAliado(@RequestParam("nombreUsuario") String nombreUsuario);
}
