package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import veb.proj.veb.entity.Kupac;

@Repository
public interface KupacRepository extends JpaRepository<Kupac, Long> {

    public Kupac getById(Long Id);
}