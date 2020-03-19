package co.com.santander.datos.calculadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.santander.datos.calculadora.entity.Aliado;
/**
 * 
 * @author brian.gomez
 *
 */
@Repository
public interface AliadoRepository extends JpaRepository<Aliado, Integer> {
	
}
