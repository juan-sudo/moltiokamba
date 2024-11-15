package com.example.proyectoInei.repository;

import com.example.proyectoInei.entities.Modulo;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Long> {
    // Método para listar proyectos cuyo estado es diferente de ARCHIVADO y ordenados
    List<Modulo> findAll(Sort sort);

}
