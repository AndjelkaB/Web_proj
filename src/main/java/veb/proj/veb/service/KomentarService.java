package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Komentar;
import veb.proj.veb.repository.KomentarRepository;

import java.util.List;

@Service
public class KomentarService {

    @Autowired
    private KomentarRepository komentarRepository;

    public Komentar GetOne(Long id)
    {
        return komentarRepository.getById(id);
    }

    public List<Komentar> GetAll()
    {
        return komentarRepository.findAll();
    }

    public void Save(Komentar k)
    {
        komentarRepository.save(k);
    }

    public void Delete(Komentar k)
    {
        komentarRepository.delete(k);
    }

}
