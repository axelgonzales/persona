package pe.inkacola.rrhh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.inkacola.rrhh.domain.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {

}
