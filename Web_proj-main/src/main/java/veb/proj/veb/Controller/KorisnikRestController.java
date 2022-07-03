package veb.proj.veb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.service.KorisnikService;
import veb.proj.veb.service.KorisnikService;

@RestController
public class KorisnikRestController
{
    @Autowired
    private KorisnikService korisnikService;


}
