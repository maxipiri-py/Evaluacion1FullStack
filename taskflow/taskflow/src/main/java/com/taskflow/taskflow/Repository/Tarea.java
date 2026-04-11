package com.taskflow.taskflow.Repository;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Repository
public class Tarea {

       private List<Tarea> lista = new ArrayList<>();

    public List<Tarea> listar() {
        return lista;
    }

    public void guardar(Tarea tarea) {
        lista.add(tarea);
    }

    public void eliminar(Tarea tarea) {
        lista.remove(tarea);
    }
}

    