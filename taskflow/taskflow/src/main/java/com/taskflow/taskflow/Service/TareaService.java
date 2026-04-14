package com.taskflow.taskflow.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskflow.taskflow.Model.Tarea;
import com.taskflow.taskflow.Repository.TareaRepository;

@Service
public class TareaService {
     @Autowired
    private TareaRepository repo;

    public List<Tarea> listarTodas(){ //aqui obtenemos toda la lista de tareas
        return repo.obtenerTodas();
    }

    public Tarea crearTarea(Tarea tarea){ // aqui creamos las tareas nuevas que se guardarán en la lista de Tarea
        return repo.guardar(tarea);
    }
    public Optional<Tarea> obtenerPorId(Long id){ //con este buscamos lo cada una de las tareas 
        return repo.buscarPorId(id);
    }
    public boolean eliminarTarea(Long id){
        Optional<Tarea> tarea =repo.buscarPorId(id); //buscamos la tarea para eliminar
        if (tarea.isPresent()){ //si la tarea se encuentra, se procede a eliminar 
            return repo.eliminar(id);
        }
        return false;
    }
}


