package veb.proj.veb.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import veb.proj.veb.entity.Lokacija;
import veb.proj.veb.entity.Menadzer;
import veb.proj.veb.entity.Restoran;
import veb.proj.veb.entity.Uloga;
import veb.proj.veb.repository.*;

public class dataConfig {

@Autowired
    private ArtiklRepository artiklRepository;

@Autowired
    private KomentarRepository komentarRepository;

@Autowired
    private KorisnikRepository korisnikRepository;

@Autowired
    private LokacijaRepository lokacijaRepository;

@Autowired
    private MenadzerRepository menadzerRepository;

@Autowired
    private PorudzbinaRepository porudzbinaRepository;

@Autowired
    private RestoranRepository restoranRepository;

@Autowired
    private TipKupcaRepository tipKupcaRepository;

    @Bean
    public boolean Instantiate() {


        Menadzer m = new Menadzer();
        menadzerRepository.save(m);
        Menadzer mm = new Menadzer();
        menadzerRepository.save(mm);

        return true;
    }

}
