package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.repository.ArtiklRepository;

import java.util.List;

@Service
public class ArtiklService {
    @Autowired
    private ArtiklRepository artiklRepository;

    public  Artikl GetOne(Long id) {
        return artiklRepository.getById(id);
    }

    public List<Artikl> GetAll()
    {
        return artiklRepository.findAll();
    }

    public void Save(Artikl a)
    {
        artiklRepository.save(a);
    }

    public void Delete(Artikl a)
    {
        artiklRepository.delete(a);
    }



    }
