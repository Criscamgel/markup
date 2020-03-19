package co.com.santander.datos.calculadora.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.com.santander.datos.calculadora.entity.Usuario;
import co.com.santander.serviciosexternos.objetoscomunes.dto.calculadora.UsuarioDTO;

/**
 * 
 * @author brian.gomez
 *
 */
@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	@Mapping(source="usuario.id", target="id")
	@Mapping(source="usuario.nombreUsuario", target="nombreUsuario")
	@Mapping(target="aliado", ignore = true)
	@Mapping(source="usuario.activo", target="activo")
	@Mapping(source="usuario.fecha", target="fecha")
	UsuarioDTO usuarioEntityToDTO(Usuario usuario);
	
	@Mapping(source="usuarioDTO.id", target="id")
	@Mapping(source="usuarioDTO.nombreUsuario", target="nombreUsuario")
	@Mapping(target="aliado", ignore = true)
	@Mapping(source="usuarioDTO.activo", target="activo")
	@Mapping(source="usuarioDTO.fecha", target="fecha")
	Usuario usuarioDTOToEntity(UsuarioDTO usuarioDTO);
	
	List<UsuarioDTO> listUsuariosEntitiesToDTOs(List<Usuario> listUsuarios);
	
	List<Usuario> listUsuariosDTOsToEntities(List<UsuarioDTO> listUsuarioDTOs);
}
