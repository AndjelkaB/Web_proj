package veb.proj.veb.repository;


import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import veb.proj.veb.entity.Restoran;
import veb.proj.veb.entity.TipRestorana;

import java.util.List;
@Repository
public interface RestoranRepository extends JpaRepository<Restoran,Long> {
    public Restoran getById (Long id);

    public Restoran getByNaziv(String naziv);

    public Restoran getByLocation(String lokacija);

    public Restoran getByTipRestorana(TipRestorana tipRestorana);

}