package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.repository.KorisnikRepository;

@Service
public class KorisnikService {
    @Autowired
    public KorisnikRepository korisnikRepository;
    public Korisnik findOneById(Long id) { return korisnikRepository.getById(id); }


}
