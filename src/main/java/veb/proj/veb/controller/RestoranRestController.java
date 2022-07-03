package veb.proj.veb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import veb.proj.veb.entity.*;
import veb.proj.veb.entityDto.RestoranDto;
import veb.proj.veb.service.KomentarService;
import veb.proj.veb.service.KorisnikService;
import veb.proj.veb.service.MenadzerService;
import veb.proj.veb.service.RestoranService;

import java.util.List;

@RestController
public class RestoranRestController {

    @Autowired
    private RestoranService restoranService;

    @Autowired
    private KorisnikService korisnikService;

    @Autowired
    private KomentarService komentarService;

    @Autowired
    private MenadzerService menadzerService;

    @GetMapping("/api/restorani")
    public ResponseEntity<List<Restoran>> getRestorani() {
        List<Restoran> restorans = restoranService.findAll();
        return ResponseEntity.ok(restorans);
    }

    @GetMapping("/api/restorani/{id}")
    public ResponseEntity<RestoranDto> getById(@PathVariable("id") Long id) {
        Restoran restoran = restoranService.findOne(id);
        List<Komentar> komentari = komentarService.getByRestoranId(id);

        RestoranDto restoranDto = new RestoranDto();
        restoranDto.setNaziv(restoran.getNaziv());
        restoranDto.setTipRestorana(restoran.getTipRestorana());

        restoranDto.setArtikli(restoran.getArtikli());
        restoranDto.setKomentari(komentari);
        restoranDto.setStatus(restoran.getStatus().toString());
        restoranDto.setLokacija(restoran.getLokacija());

        return ResponseEntity.ok((restoranDto));
    }

    // kreiranje novog restorana

    @PostMapping("/api/restoran/create")
    public ResponseEntity<String> createRestoran(@RequestBody RestoranDto restoranDto) {

        if(restoranDto.getNaziv().isEmpty()) {
            return new ResponseEntity<>("Neispravni podaci", HttpStatus.BAD_REQUEST);
        }

        Restoran restoran = new Restoran();

        restoran.setNaziv(restoranDto.getNaziv());
        restoran.setTipRestorana(restoran.getTipRestorana());
        restoran.setLokacija(restoranDto.getLokacija());

        restoran.setStatus(StatusRestorana.valueOf(restoranDto.getStatus()));

        restoranService.Save(restoran);

        return ResponseEntity.ok("Restoran je uspjesno dodat");
    }

    // Pretraga restorana po nazivu

    @GetMapping("/api/restorani/naziv/{naziv}")
    public ResponseEntity<Restoran> getByNaziv(@PathVariable String naziv) {
        Restoran restoran = restoranService.getByNaziv(naziv);
        return ResponseEntity.ok(restoran);
    }

    // pretraga restorana po lokaciji

    @GetMapping("/api/restorani/lokacija/{id}")
    public ResponseEntity<Restoran> getByLokacija (@PathVariable Long id) {
        Restoran restoran = restoranService.getByLocation(id);
        return ResponseEntity.ok(restoran);
    }
}
