package ittec.cisco.apicisco.cis.controller;

import org.springframework.web.bind.annotation.*;
import ittec.cisco.apicisco.cis.model.Materia;
import ittec.cisco.apicisco.cis.service.MateriaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping
    public List<Materia> getAllMaterias() {
        return materiaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Materia> getMateriaById(@PathVariable String id) {
        return materiaService.findById(id);
    }

    @PostMapping
    public Materia createMateria(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }


    @DeleteMapping("/{id}")
    public void deleteMateria(@PathVariable String id) {

        materiaService.deleteById(id);
    }
}
