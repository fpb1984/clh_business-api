package cl.clh.tramos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.clh.tramos.model.PropuestasSiagf;



public interface EmpleadoRepository extends JpaRepository<PropuestasSiagf, Long> {
	
	List<PropuestasSiagf> findAll();


}
