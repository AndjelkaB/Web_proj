package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.entity.Porudzbina;

public interface PorudzbinaRepository extends JpaRepository<Porudzbina, Long> {
    public Porudzbina getById(Long id);
}
