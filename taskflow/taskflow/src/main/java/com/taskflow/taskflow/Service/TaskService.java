package com.taskflow.taskflow.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.taskflow.taskflow.Repository.Tarea;
@Service
public class TaskService {
	@Autowired
	private TaskService taskService;
    
    public List<Tarea> listarTodos() {
        return repository.findAll();
    }

    



}

