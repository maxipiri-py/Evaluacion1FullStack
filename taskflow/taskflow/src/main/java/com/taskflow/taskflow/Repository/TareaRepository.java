package com.taskflow.taskflow.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.taskflow.taskflow.Model.Tarea;

@Repository
public class TareaRepository {
    
private List<Tarea> tareas = new ArrayList<>();

    public Tarea guardar(Tarea tarea){
        tareas.add(tarea);
        return tarea;
    }
    
    public List<Tarea> obtenerTodas(){
        return tareas;
    }

    public Optional<Tarea> buscarPorId(Long id){
        return tareas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
    }

    public boolean eliminar(Long id) {
        return tareas.removeIf(t -> t.getId().equals(id));
    }
}


