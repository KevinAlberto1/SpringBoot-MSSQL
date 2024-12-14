package ittec.cisco.apicisco.cis.service;

import ittec.cisco.apicisco.cis.model.Semestre;
import ittec.cisco.apicisco.cis.repository.SemestreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemestreService {

    private final SemestreRepository semestreRepository;

    public SemestreService(SemestreRepository semestreRepository) {
        this.semestreRepository = semestreRepository;
    }

    public List<Semestre> findAll() {
        return (List<Semestre>) semestreRepository.findAll();
    }

    public Optional<Semestre>findById(Integer id) {
        return semestreRepository.findById(id);
    }
    public Semestre save(Semestre semestre) {
        return semestreRepository.save(semestre);
    }
    public void deleteById(Integer id) {
        semestreRepository.deleteById(id);
    }
}
