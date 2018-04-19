package com.tr.cv.services;

import com.tr.nebula.persistence.jpa.services.JpaService;
import com.tr.cv.domain.Todo;
import com.tr.cv.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kamilbukum on 06/03/2017.
 */
@Service
public class TodoServices extends JpaService<Todo, Long> {

    @Autowired
    public TodoServices(TodoRepository repository) {
        super(repository);
    }
}
