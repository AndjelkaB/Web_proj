package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.TipKupca;
import veb.proj.veb.repository.TipKupcaRepository;

import java.util.List;

@Service
public class TipKupcaService {

    @Autowired
    private TipKupcaRepository tipKupcaRepository;

    public TipKupca GetOne(Long id) {
        return tipKupcaRepository.getById(id);
    }

    public List<TipKupca> GetAll()
    {
        return tipKupcaRepository.findAll();
    }

    public void Save(TipKupca tk)
    {
        tipKupcaRepository.save(tk);
    }

    public void Delete(TipKupca tk)
    {
        tipKupcaRepository.delete(tk);
    }

}
