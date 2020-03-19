package co.com.santander.datos.calculadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.santander.datos.calculadora.entity.Aliado;
import co.com.santander.datos.calculadora.entity.Usuario;

import java.util.Optional;

/**
 * 
 * @author brian.gomez
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	@Query("select a from Usuario u join u.aliado a where u.nombreUsuario like ?1")
    Optional<Aliado> findByNombreUsuario(String nombreUsuario);
	
}
