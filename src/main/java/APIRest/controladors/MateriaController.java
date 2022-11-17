package APIRest.controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import APIRest.entitats.Materia;
import APIRest.repositoris.MateriaRepositori;

@RestController
@RequestMapping("api")
public class MateriaController {
	
	@Autowired
	MateriaRepositori materiaRep;
	
    @GetMapping("materias")
    public Iterable<Materia> getMateria(){
        return materiaRep.findAll();
    }

    @GetMapping("materias/{id}")
    public Materia getMateria(@PathVariable long id) {
        Materia client = materiaRep.findById(id).get();

        return client;
    }
}
