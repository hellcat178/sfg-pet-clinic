package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by bh on 8/5/2020.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}
