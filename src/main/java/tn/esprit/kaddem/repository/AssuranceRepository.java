package tn.esprit.kaddem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kaddem.entity.Assurance;

@Repository
public interface AssuranceRepository extends JpaRepository<Assurance, Long > {
}
