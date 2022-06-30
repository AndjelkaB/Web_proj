package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Komentar;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.repository.KorisnikRepository;

import java.util.List;

@Service
public class KorisnikService {
    @Autowired
    public KorisnikRepository korisnikRepository;
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
