package soa.fsb.projectsoa.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import soa.fsb.projectsoa.models.Ingredient;

public interface IngredientsRepository extends JpaRepository<Ingredient,Long> {
}
