package com.taskflow.taskflow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskflow.taskflow.Model.Tarea;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/tareas")
public class TareaController {
  @Autowired
    private TareaController service;

    @GetMapping
    public List<Tarea> listar(){
        return service.listarTodas();
    }
    @PostMapping
    public ResponseEntity<Tarea> crear(@Valid @RequestBody Tarea tarea){
        return ResponseEntity.status(201).body(service.crearTarea(tarea));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> ovtener(@PathVariable Long id){
        return service.obtenerPorId(id)
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (service.eliminarTarea(id)) 
        return ResponseEntity.notFound().build(); 
    }

}
