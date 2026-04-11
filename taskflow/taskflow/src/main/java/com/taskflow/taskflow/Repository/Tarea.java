package com.taskflow.taskflow.Repository;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@Repository
public class Tarea {

    private Long id;
    private String titulo;
    private String Descripcion;
    private Estado estado;
    private Prioridad prioridad;
    private String responsable;
    private LocalDate fechaCreacion;
    private LocalDate fechaLimite;

}


   