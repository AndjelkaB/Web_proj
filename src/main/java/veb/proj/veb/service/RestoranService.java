package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Lokacija;
import veb.proj.veb.entity.Restoran;
import veb.proj.veb.repository.RestoranRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RestoranService {

    @Autowired
    private RestoranRepository restoranRepository;

    // pretraga restorana po ID
    public Restoran findOne(Long id) {
        Optional<Restoran> restoran = restoranRepository.findById(id);
        if (restoran.isPresent())
            return restoran.get();

        return null;
    }

    // lista svih restorana
    public List<Restoran> findAll() { return restoranRepository.findAll(); }

    // dodavanje novog restorana
    public void Save(Restoran r)
    {
        restoranRepository.save(r);
    }

    // brisanje restorana
    public void Delete(Restoran r)
    {
        restoranRepository.delete(r);
    }

    public Restoran getByNaziv (String naziv) {
        return restoranRepository.getByNaziv(naziv);
    }

    public Restoran getByLocation(Lokacija lokacija) {
        return restoranRepository.getByLocation(lokacija);
    }
}