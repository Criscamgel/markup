package co.com.santander.datos.calculadora.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.com.santander.datos.calculadora.entity.Aliado;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.AliadoDTO;

/**
 * 
 * @author brian.gomez
 *
 */
@Mapper(uses = { UsuarioMapper.class, ParametroMapper.class }, componentModel = "spring")
public interface AliadoMapper {

	@Mapping(source="aliado.id", target="id")
	@Mapping(source="aliado.nombreAliado", target="nombreAliado")
	@Mapping(source="aliado.activo", target="activo")
	@Mapping(source="aliado.fecha", target="fecha")
	@Mapping(source="aliado.usuario", target="usuario")
	@Mapping(source="aliado.parametros", target="parametros")
	AliadoDTO aliadoEntityToDTO(Aliado aliado);
	
	@Mapping(source="aliadoDTO.id", target="id")
	@Mapping(source="aliadoDTO.nombreAliado", target="nombreAliado")
	@Mapping(source="aliadoDTO.activo", target="activo")
	@Mapping(source="aliadoDTO.fecha", target="fecha")
	@Mapping(source="aliadoDTO.usuario", target="usuario")
	@Mapping(source="aliadoDTO.parametros", target="parametros")
	Aliado aliadoDTOToEntity(AliadoDTO aliadoDTO);
	
	List<AliadoDTO> listAliadosEntitiesToDTOs(List<Aliado> listAliados);
	
	List<Aliado> listAliadosDTOsToEntities(List<AliadoDTO> listAliadoDTOs);
}
