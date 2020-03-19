package co.com.santander.serviciosexternos.cache.utils;

import co.com.santander.serviciosexternos.cache.config.ObjCacheManager;
import co.com.santander.serviciosexternos.client.AccesoDatosExternosClient;
import co.com.santander.serviciosexternos.objetoscomunes.dto.parametroservicio.ParametroServicioDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CacheUtils {
	
	@Autowired
	AccesoDatosExternosClient accesoDatosClient;

	public void crearCacheParametrosCliente(Integer idCliente) {
		try {
            List<ParametroServicioDTO> parametroServicioDTOList = accesoDatosClient.getParametrosCliente(String.valueOf(idCliente));
            ObjectMapper mapper = new ObjectMapper();
            parametroServicioDTOList = mapper.convertValue(parametroServicioDTOList, new TypeReference<List<ParametroServicioDTO>>() { });
            if (parametroServicioDTOList != null &&  parametroServicioDTOList.size() > 0) {
                ObjCacheManager manager = new ObjCacheManager();
                manager.putInCache(idCliente, parametroServicioDTOList);
            }
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
