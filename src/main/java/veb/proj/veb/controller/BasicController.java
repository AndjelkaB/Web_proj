package veb.proj.veb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.service.KorisnikService;

@Controller
public class BasicController {


    @Autowired
    private KorisnikService korisnikService;


    //--------------------------------------//
    @GetMapping("/")
    public String home() {return "home.html";}

    //--------------------------------------//

    @GetMapping("/signup")
    public String signup(Model model) {
        Korisnik korisnik = new Korisnik();
        model.addAttribute("korisnik", korisnik);
        return "signup.html";
    }

}
