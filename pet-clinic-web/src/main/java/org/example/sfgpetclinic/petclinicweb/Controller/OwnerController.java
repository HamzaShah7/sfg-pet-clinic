package org.example.sfgpetclinic.petclinicweb.Controller;

import org.example.sfgpetclinic.petclinicdata.Service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/index"})
    public String showOwner(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index.html";
    }
}
