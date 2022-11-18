package APIRest.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APIRest.entitats.Professor;
import APIRest.repositoris.ProfessorRepositori;

@RestController
@RequestMapping("api")
public class ProfessorController {
	@Autowired
	ProfessorRepositori professorRep;
	
    @GetMapping("professor")
    public Iterable<Professor> getProfessor(){
        return professorRep.findAll();
    }

    @GetMapping("professor/{id}")
    public Professor getProfessor(@PathVariable long id) {
        Professor professor = professorRep.findById(id).get();

        return professor;
    }
}
