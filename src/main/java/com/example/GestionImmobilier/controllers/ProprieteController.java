package com.example.GestionImmobilier.controllers;

import com.example.GestionImmobilier.entities.Propriete;
import com.example.GestionImmobilier.services.PropieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProprieteController {
    @Autowired
    PropieteService propieteService;
    //


    @RequestMapping("/createPropriete")
    public String createPropriete(){
        return "CreatePropriete";
    }
    @RequestMapping("/savePropriete")
    public String savePropriete(
            @ModelAttribute("propriete") Propriete propriete,
            ModelMap modelMap
            ){


        Propriete prop=propieteService.savePropriete(propriete);
        String messageController = "La propiete dont le Id : " + prop.getId_prop() + " est enregistrée ";
        modelMap.addAttribute("messageJsp",messageController);

        return "CreatePropriete";

    }
    @RequestMapping("/proprietelist")
    public String proprietelist(ModelMap modelMap,
                                @RequestParam(name = "page",defaultValue = "0") int page,
                                @RequestParam(name = "size",defaultValue = "10") int size
                                ){
        Page<Propriete> proprietesController=propieteService.getAllProprieteByPage(page, size);
        modelMap.addAttribute("proprieteJsp",proprietesController);
        modelMap.addAttribute("pages",new int[proprietesController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);
        return "ProprieteList";
    }
    @RequestMapping("/deletePropriete")
    public String deletePropriete(@RequestParam("id") Long id, ModelMap modelMap,
                                  @RequestParam(name = "page",defaultValue = "0") int page,
                                  @RequestParam(name = "size",defaultValue = "10") int size
                                  ){
        propieteService.deleteProprieteById(id);
        Page<Propriete> proprietesController=propieteService.getAllProprieteByPage(page, size);
        modelMap.addAttribute("proprieteJsp",proprietesController);
        modelMap.addAttribute("pages",new int[proprietesController.getTotalPages()]);
        modelMap.addAttribute("currentPage",page);
        return "ProprieteList";

    }
    @RequestMapping("/showProduct")
    public String showProduct(@RequestParam("id") Long id, ModelMap modelMap){
        Propriete proprieteController=propieteService.getPropriete(id);
        modelMap.addAttribute("proprieteJsp",proprieteController);
        return "EditPropriete";

    }
    @RequestMapping("/updatePropriete")
    public String updatePropriete(
            @ModelAttribute("propriete") Propriete propriete,
            ModelMap modelMap
    ){


        Propriete prop=propieteService.savePropriete(propriete);


        return "CreatePropriete";

    }

}
