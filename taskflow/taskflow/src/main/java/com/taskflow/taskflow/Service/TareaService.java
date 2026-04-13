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

    public List<Tarea> listarTodas(){
        return repo.obtenerTodas();
    }

    public Tarea crearTarea(Tarea tarea){
        return repo.guardar(tarea);
    }
    public Optional<Tarea> obtenerPorId(Long id){
        return repo.buscarPorId(id);
    }
    public boolean eliminarTarea(Long id){
        Optional<Tarea> tarea =repo.buscarPorId(id);
        if (tarea.isPresent()){
            return repo.eliminar(id);
        }
        return false;
    }
}


