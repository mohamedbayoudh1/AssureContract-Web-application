package tn.esprit.kaddem.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kaddem.entity.Assurance;
import tn.esprit.kaddem.service.AssuranceServiceImpl;

import java.util.List;


@Tag(name ="Product Management")
@RestController
@RequestMapping("/assurance")

public class AssuranceRestController {
    @Autowired
    AssuranceServiceImpl AssuranceService;

    // http://localhost:8081/SpringMVC/assurance/add-assurance
    @Operation(description ="pour ajouterr un assurance")
    @PostMapping("/add-assurance")
    public Assurance addAssurance(@RequestBody Assurance a)
    {
        Assurance assurance = AssuranceService.addAssurance(a);
        return assurance;
    }
    // http://localhost:8081/SpringMVC//assurance/remove-assurance/{assurance-id}
    @Operation(description ="pour supprimer un assurance")
    @DeleteMapping("/remove-assurance/{assurance-id}")
    public void removeAssurance(@PathVariable("assurance-id") Long assuranceId) {
        AssuranceService.removeAssurance(assuranceId);

    }

    // http://localhost:8081/SpringMVC//assurance/modify-assurance
    @Operation(description ="pour modifier le detail d'un assurance")
    @PutMapping("/modify-assurance")
    public Assurance modifyAssurance(@RequestBody Assurance a) {
        Assurance assurance = AssuranceService.modifyAssurance(a);
        return assurance;
    }

    // http://localhost:8081/SpringMVC/assurance/retrieve-all-Assurances
    //@Operation(description ="pour Retrouver all products")
    @GetMapping("/retrieve-all-Assurances")
    public List<Assurance> getAssurances() {
        List< Assurance > listAssurances = AssuranceService.retrieveAllAssurances();
        return listAssurances;
    }

    // http://localhost:8081/SpringMVC/assurance/retrieve-assurance/id
    //@Operation(description ="Retrieve products par Id exacte")
    @GetMapping("/retrieve-assurance/{assurance-id}")
    public Assurance retrieveAssurance(@PathVariable("assurance-id") Long assuranceId) {
        Assurance assurance = AssuranceService.retrieveAssurance(assuranceId);
        return assurance;
    }


}


