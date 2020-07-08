package cl.clh.tramos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.clh.tramos.model.Preresult;



public interface PreresultRepository extends JpaRepository<Preresult, Long> {
	
	List<Preresult> findAll();

	//96634140-8
	@Query("FROM Preresult WHERE periodo = ?1 and rutEmpresa = ?2")
    List<Preresult> findByPeriodo(String periodo, String rutEmpresa);

}
