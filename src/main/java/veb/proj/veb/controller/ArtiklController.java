package veb.proj.veb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Restoran;
import veb.proj.veb.entity.TipHrane;
import veb.proj.veb.entityDto.ArtiklDto;
import veb.proj.veb.service.ArtiklService;
import veb.proj.veb.service.RestoranService;

import java.util.List;

@RestController
public class ArtiklController {

    @Autowired
    private ArtiklService artiklService;

    @Autowired
    private RestoranService restoranService;

    @GetMapping("/api/artikli")
    public List<Artikl> getArtikli() {
        List<Artikl> artikli = artiklService.findAll();

        return  artikli;
    }

    @GetMapping("/api/artikli/{id}")
    public Artikl getArtikl(@PathVariable(name = "id") Long id) {
        Artikl artikl = artiklService.findOne(id);
        return artikl;
    }

    @PostMapping("/api/artikl/create")
    public String createArtikl(@RequestBody ArtiklDto artiklDto) {
        Artikl artikl = new Artikl();

        artikl.setNaziv(artiklDto.getNaziv());
        artikl.setTipHrane(TipHrane.valueOf(artiklDto.getTipHrane()));
        artikl.setOpis(artiklDto.getOpis());
        artikl.setCijena(artikl.getCijena());
        artikl.setKolicina(artiklDto.getKolicina());

        Restoran restoran = restoranService.findOne(artiklDto.getRestoranID());
        artikl.setRestoran(restoran);

        this.artiklService.Save(artikl);
        return "Artikl je uspjesno sacuvan";
    }

    // izmjena info o artiklu
    @PutMapping("/api/artikl/edit")
    public String editArtikal(@RequestBody Artikl artikl) {
        Artikl editArtikl = artiklService.findOne(artikl.getId());

        editArtikl.setNaziv(artikl.getNaziv());
        editArtikl.setTipHrane(artikl.getTipHrane());
        editArtikl.setKolicina(artikl.getKolicina());
        editArtikl.setOpis(artikl.getOpis());
        editArtikl.setCijena(artikl.getCijena());


        this.artiklService.Save(editArtikl);
        return "Artikal je uspesno izmenjen!";
    }

    //Brisanje artikla
    @DeleteMapping("/api/artikl/delete/{id}")
    public String deleteArtikl(@PathVariable(name = "id") Long id) {

        Artikl artikl = artiklService.findOne(id);
        this.artiklService.Delete(artikl);
        return "Artikal je uspesno obrisan!";
    }



}
