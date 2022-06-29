package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import veb.proj.veb.entity.Artikl;

@Repository
public interface ArtiklRepository extends JpaRepository<Artikl, Long> {
    public Artikl getById(Long id);

}
