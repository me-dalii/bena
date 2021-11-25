package soa.fsb.projectsoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soa.fsb.projectsoa.models.Recettes;


public interface RecettesRepository extends JpaRepository<Recettes,Long> {
}
