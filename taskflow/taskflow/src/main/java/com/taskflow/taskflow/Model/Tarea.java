package com.taskflow.taskflow.Model;

import java.time.LocalDate;

import com.taskflow.taskflow.Repository.Estado;
import com.taskflow.taskflow.Repository.Prioridad;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Tarea {
 
    @NotNull(message = "El ID no puede ser nulo")
    private long id;

    @NotBlank(message = "El titulo es obligatorio")
    private String titulo;

    @NotBlank(message = "la descripción es obligatoria")
    private String descripción;

    @NotNull(message = "el estado es obligatorio")
    @private Estado estado;

    @NotNull(message = "la prioridad es obligatoria")
    private Prioridad prioridad;

    @NotBlank(message = "el responsable es obligatorio")
    private String responsable;

    private LocalDate fechaCreacion = LocalDate.now();

    @NotNull(message =  "La fecha limite es obligatoria")
    private LocalDate fechaLimite;

}