package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.entity.Korisnik;
import veb.proj.veb.entity.Uloga;

import java.io.Serializable;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
    Korisnik getByUsername(String username);

    Korisnik getByRole(Uloga uloga);

    public Korisnik getById(Long Id);
}
