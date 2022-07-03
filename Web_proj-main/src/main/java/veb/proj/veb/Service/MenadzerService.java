package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.entity.Menadzer;
import veb.proj.veb.repository.MenadzerRepository;

import java.util.Optional;

@Service
public class MenadzerService {

    @Autowired
    private MenadzerRepository menadzerRepository;

    public Korisnik findOne(Long id) {
        Optional<Menadzer> menadzer = menadzerRepository.findById(id);
        if(menadzer.isPresent())
            return menadzer.get();

        return null;
    }
}
