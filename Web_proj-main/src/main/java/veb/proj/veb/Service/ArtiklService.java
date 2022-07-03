package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.repository.ArtiklRepository;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;

@Service
public class ArtiklService {
    @Autowired
    private ArtiklRepository artiklRepository;

    public  Artikl findOne(Long id) {
        Optional<Artikl> pronadjiAtrikl = artiklRepository.findById(id);
        if (pronadjiAtrikl.isPresent())
            return pronadjiAtrikl.get();
        return null;
    }

    public  Artikl GetOne(Long id) {
        return artiklRepository.getById(id);
    }

    public List<Artikl> findAll()
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
