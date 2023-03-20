package com.example.tomas.Repository;

import com.example.tomas.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

    public Optional<Persona> findById(int id);

    public Optional<Persona> findByNombre(String nombre);

    public void deleteById(int id);

    public boolean existsById(int id);

    public boolean existsByNombre(String nombre);

}
