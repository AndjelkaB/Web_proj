package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Restoran;
import veb.proj.veb.repository.RestoranRepository;

import java.util.List;

@Service
public class RestoranService {

    @Autowired
    private RestoranRepository restoranRepository;

    public Restoran GetOne(Long id) {
        return restoranRepository.getById(id);
    }

    public List<Restoran> GetAll()
    {
        return restoranRepository.findAll();
    }

    public void Save(Restoran r)
    {
        restoranRepository.save(r);
    }

    public void Delete(Restoran r)
    {
        restoranRepository.delete(r);
    }


}