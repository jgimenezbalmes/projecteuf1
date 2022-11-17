package APIRest.repositoris;

import org.springframework.data.repository.CrudRepository;

import APIRest.entitats.Professor;

public interface ProfessorRepositori extends CrudRepository<Professor, Long> {

}
