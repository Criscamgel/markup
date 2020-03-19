package co.com.santander.datos.calculadora.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.com.santander.datos.calculadora.entity.Parametro;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.ParametroDTO;

/**
 * 
 * @author brian.gomez
 *
 */
@Mapper(componentModel = "spring")
public interface ParametroMapper {

	@Mapping(source="parametro.id", target="id")
	@Mapping(source="parametro.nombre", target="nombre")
	@Mapping(source="parametro.tipo", target="tipo")
	@Mapping(source="parametro.valorNumerico", target="valorNumerico")
	@Mapping(source="parametro.valorTexto", target="valorTexto")
	@Mapping(source="parametro.activo", target="activo")
	@Mapping(target="aliado", ignore = true)
	ParametroDTO parametroEntityToDTO(Parametro parametro);
	
	@Mapping(source="parametroDTO.id", target="id")
	@Mapping(source="parametroDTO.nombre", target="nombre")
	@Mapping(source="parametroDTO.tipo", target="tipo")
	@Mapping(source="parametroDTO.valorNumerico", target="valorNumerico")
	@Mapping(source="parametroDTO.valorTexto", target="valorTexto")
	@Mapping(source="parametroDTO.activo", target="activo")
	@Mapping(target="aliado", ignore = true)
	Parametro parametroDTOToEntity(ParametroDTO parametroDTO);
	
	List<ParametroDTO> listParametrosEntitiesToDTOs(List<Parametro> listParametros);
	
	List<Parametro> listParametrosDTOsToEntities(List<ParametroDTO> listParametroDTOs);
}
