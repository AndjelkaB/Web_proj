package veb.proj.veb.service;

import org.springframework.beans.factory.annotation.Autowired;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.entity.Kupac;
import veb.proj.veb.entity.Uloga;
import veb.proj.veb.repository.KupacRepository;

import java.util.List;

public class SignupService {

    @Autowired
    private KupacRepository kupacRepository;

    private void name_check(String korisnickoIme, List<Kupac> kupci) throws Exception
    {
        for(Korisnik k : kupci)
        {
            if(k.getKorisnickoIme().equals(korisnickoIme))
            {
                wrong_username(korisnickoIme);
            }
        }
    }

    private void wrong_username(String korisnickoIme) throws Exception
    {
        throw new Exception("Username already exist!");
    }

    public void Signup(Kupac k) throws Exception
    {
        name_check(k.getKorisnickoIme(), kupacRepository.findAll());
        k.setUloga("kupac");
        kupacRepository.save(k);
    }
}
