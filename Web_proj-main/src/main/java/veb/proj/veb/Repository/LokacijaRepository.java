package veb.proj.veb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.entity.Lokacija;

public interface LokacijaRepository extends JpaRepository<Lokacija, Long> {
    public Lokacija getById(Long id);
}
