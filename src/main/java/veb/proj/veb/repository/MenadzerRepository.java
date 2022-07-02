package veb.proj.veb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import veb.proj.veb.entity.Menadzer;

public interface MenadzerRepository extends JpaRepository<Menadzer, Long>
{
    Menadzer getById(Long id);
}
