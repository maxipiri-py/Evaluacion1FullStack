package com.taskflow.taskflow.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.taskflow.taskflow.Repository.Estado;
import com.taskflow.taskflow.Repository.Prioridad;
import com.taskflow.taskflow.Repository.Tarea;

import jakarta.validation.constraints.NotBlank;
@Service
public class TaskService {
	@Autowired

    
private Long id;
    private String titulo1;
    private String Descripcion1;
    private Estado estado;
    private Prioridad prioridad;
    private String responsable;
    private LocalDate fechaCreacion;
    private LocalDate fechaLimite1;



    private Long id;

    @NotBlank(message = "Preparar presentacion Q2")
    private String titulo;

    @NotBlank(message = "Elaborar slides con resultados del segundo trimestre.")
    private String Descripcion;

    @NotBlank(message = "PENDIENTE")
    private String patente;

    
    private String "ana.garcia",
    private LocalDate fechaLimite: "2025-05-15"


        public List<Tarea> listar() {
        return repo.listar();
    }
}





}

