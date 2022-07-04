package veb.proj.veb.configuration;

import org.springframework.beans.factory.annotation.Autowired;
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

}
