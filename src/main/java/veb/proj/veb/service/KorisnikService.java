package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Komentar;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.entity.Uloga;
import veb.proj.veb.repository.KorisnikRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KorisnikService {
    @Autowired
    public KorisnikRepository korisnikRepository;

    // registracija
    /* public Korisnik RegisterKorisnik(Korisnik korisnik) {
     //   return korisnikRepository.save(korisnik);
    } */

    // login
    public Korisnik login(String username, String lozinka) {
        Korisnik korisnik = korisnikRepository.getByKorisnickoIme(username);
        if (korisnik == null || !korisnik.getLozinka().equals(lozinka))
            return null;
        return  korisnik;
    }

    // prikaz jednog korisnika
    public Korisnik findOne(Long id) {
        Optional<Korisnik> korisnik = korisnikRepository.findById(id);
        if(korisnik.isPresent())
            return korisnik.get();

        return null;
    }

    // prikaz svih korisnika
    public List<Korisnik> findAll() {
        return korisnikRepository.findAll();
    }

    // odabir jednog korisnika po korisnickom imenu

    public Korisnik getByUsername(String username) {
        Korisnik korisnik = korisnikRepository.getByKorisnickoIme(username);
        return korisnik;
    }

    // odabir jednog korisnika po ulozi

    public Korisnik getByRole(String uloga) {
        Korisnik korisnik = korisnikRepository.getByUloga(uloga);
        return korisnik;
    }

    public Korisnik GetOne(Long id)
    {
        return korisnikRepository.getById(id);
    }

    public List<Korisnik> GetAll()
    {
        return korisnikRepository.findAll();
    }

    public void Save(Korisnik korisnik)
    {
        korisnikRepository.save(korisnik);
    }

    public void Delete(Korisnik korisnik)
    {
        korisnikRepository.delete(korisnik);
    }


}
