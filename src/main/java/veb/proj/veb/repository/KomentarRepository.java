package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import veb.proj.veb.entity.Komentar;
@Repository
public interface KomentarRepository extends JpaRepository<Komentar, Long> {
    public Komentar getById(Long id);
}