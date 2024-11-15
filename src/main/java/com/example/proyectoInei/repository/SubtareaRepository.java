package com.example.proyectoInei.repository;

import com.example.proyectoInei.entities.Subtarea;
import com.example.proyectoInei.entities.Tarea;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubtareaRepository extends JpaRepository<Subtarea, Long> {
    List<Subtarea> findByTarea(Tarea tarea);

    List<Subtarea> findAll(Sort sort);
}
