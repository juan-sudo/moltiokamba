package com.example.proyectoInei.repository;

import com.example.proyectoInei.entities.Modulo;
import com.example.proyectoInei.entities.Tarea;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findAll(Sort sort);
    // Encontrar todas las tareas por módulo
    List<Tarea> findByModulo(Modulo modulo);

}
