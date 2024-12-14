package ittec.cisco.apicisco.cis.controller;

import org.springframework.web.bind.annotation.*;
import ittec.cisco.apicisco.cis.model.Semestre;
import org.springframework.ui.Model;
import ittec.cisco.apicisco.cis.service.SemestreService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/semestres")
public class SemestreController {

    private final SemestreService semestreService;

    public SemestreController(SemestreService semestreService) {
        this.semestreService = semestreService;
    }
    @GetMapping
    public String listSemestres(Model model) {
        model.addAttribute("semestres", semestreService.findAll());
        return "semestres/list";
    }
    @GetMapping("/create")
    public String createSemestre(Model model) {
        model.addAttribute("semestre", new Semestre());
        return "semestres/create";
    }
    @PostMapping
    public String createSemestre(@ModelAttribute Semestre semestre) {
        semestreService.save(semestre);
        return "redirect:/semestres";
    }
    @PostMapping("/edit/{id}")
    public String editSemestreForm(@PathVariable Integer id, Model model) {
        Optional<Semestre> semestre = semestreService.findById(id);
        if(semestre.isPresent()) {
            model.addAttribute("semestre", semestre.get());
            return "semestres/edit";
        }else {
            return "redirect:/semestres";
        }
    }
    /*@PostMapping("/edit/{id}")
    public String editSemestre(@PathVariable Integer id, @ModelAttribute Semestre semestre) {
         semestreService
         semestreService.save(semestre);
         return "redirect:/semestres";
    }*/
    @GetMapping("(/delete/{id}")
    public String deleteSemestre(@PathVariable Integer id) {
        semestreService.deleteById(id);
        return "redirect:/semestres";
    }
}
