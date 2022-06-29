package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.entity.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik,Long> {
    public Korisnik getById(Long Id);
}
