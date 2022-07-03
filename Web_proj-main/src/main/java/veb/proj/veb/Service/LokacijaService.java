package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Lokacija;
import veb.proj.veb.repository.LokacijaRepository;

import java.util.List;

@Service
public class LokacijaService {

    @Autowired
    private LokacijaRepository lokacijaRepository;

    public Lokacija GetOne(Long id) {
        return lokacijaRepository.getById(id);
    }

    public List<Lokacija> GetAll()
    {
        return lokacijaRepository.findAll();
    }

    public void Save(Lokacija l)
    {
        lokacijaRepository.save(l);
    }

    public void Delete(Lokacija l)
    {
        lokacijaRepository.delete(l);
    }
}
