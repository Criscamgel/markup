package co.com.santander.serviciosexternos.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.com.santander.serviciosexternos.objetoscomunes.dto.parametroservicio.ParametroServicioDTO;

@FeignClient(value = "${acceso-datos-externos.service-name}", url = "${acceso-datos-externos.url}")
public interface AccesoDatosExternosClient {

	@RequestMapping(method = RequestMethod.GET, value = "/getParametrosCliente", produces = "application/json")
	List<ParametroServicioDTO> getParametrosCliente(@RequestParam("idCliente") String idClient);
}
