package soa.fsb.projectsoa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import soa.fsb.projectsoa.models.Ingredient;
import soa.fsb.projectsoa.models.Recettes;
import soa.fsb.projectsoa.repositories.RecettesRepository;

import java.util.ArrayList;
import java.util.List;

public class RecettesController {

    @Autowired
    RecettesRepository recettesRepository;

    @GetMapping("/recettes/{name}")
    public List<Recettes> getByName(@PathVariable String name){
        List<Recettes> recettesList = recettesRepository.findAll();
        List<Recettes> result= new ArrayList<Recettes>();
        for (Recettes r : recettesList){
            Boolean check = false;
            List<Ingredient> ingredients = r.getIngredient();
            for(Ingredient i : ingredients){
                if (name == i.getNom()){
                    check = true;
                }
            }
            if(check){
                result.add(r);
            }
        }
        return result;
    }
}
