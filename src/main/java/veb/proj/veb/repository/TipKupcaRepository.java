package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.entity.TipKupca;

public interface TipKupcaRepository extends JpaRepository<TipKupca, Long> {
    public TipKupca getById(Long id);
}
