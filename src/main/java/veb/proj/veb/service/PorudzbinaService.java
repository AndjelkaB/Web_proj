package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Porudzbina;
import veb.proj.veb.repository.PorudzbinaRepository;

import java.util.List;

@Service
public class PorudzbinaService {

    @Autowired
    private PorudzbinaRepository porudzbinaRepository;

    public Porudzbina GetOne(Long id) {
        return porudzbinaRepository.getById(id);
    }

    public List<Porudzbina> GetAll()
    {
        return porudzbinaRepository.findAll();
    }

    public void Save(Porudzbina p)
    {
        porudzbinaRepository.save(p);
    }

    public void Delete(Porudzbina p)
    {
        porudzbinaRepository.delete(p);
    }

}
