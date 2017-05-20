package org.cer.web;

import org.cer.dao.EntrepriseRepository;
import org.cer.entities.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by celghandour on 20/05/17.
 */
@Controller
public class TaxeController {

    @Autowired
    private EntrepriseRepository entrepriseRepository ;

    @RequestMapping(value="/entreprises",method= RequestMethod.GET)
    public String index (Model model){

        List<Entreprise> entreprises = entrepriseRepository.findAll();
        model.addAttribute("listEntreprises",entreprises);

        return "entreprises";



    }
}
