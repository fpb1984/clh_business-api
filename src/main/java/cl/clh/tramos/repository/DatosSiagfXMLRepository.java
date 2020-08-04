package cl.clh.tramos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.clh.tramos.model.DatosXmlSiagf;



public interface DatosSiagfXMLRepository extends JpaRepository<DatosXmlSiagf, Long> {
	
	List<DatosXmlSiagf> findAll();

}
