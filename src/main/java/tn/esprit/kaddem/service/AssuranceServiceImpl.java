package tn.esprit.kaddem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kaddem.entity.Assurance;
import tn.esprit.kaddem.repository.AssuranceRepository;
import java.util.List;

@Service
public class AssuranceServiceImpl {

    @Autowired
    AssuranceRepository AssuranceRepository;
    public Assurance addAssurance(Assurance p) {

        return AssuranceRepository.save(p);

    }

    public void removeAssurance(Long AssuranceId) {

        AssuranceRepository.deleteById(AssuranceId);

    }

    public Assurance modifyAssurance(Assurance Assurance) {

        return AssuranceRepository.save(Assurance);

    }

    public List<Assurance> retrieveAllAssurances() {

        return AssuranceRepository.findAll();

    }

    public Assurance retrieveAssurance(Long assuranceId) {

        return AssuranceRepository.findById(assuranceId).get();


    }


}


