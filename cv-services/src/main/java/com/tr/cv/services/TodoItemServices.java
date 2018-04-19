package com.tr.cv.services;

import com.tr.nebula.persistence.jpa.services.JpaService;
import com.tr.cv.domain.TodoItem;
import com.tr.cv.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kamilbukum on 06/03/2017.
 */
@Service
public class TodoItemServices extends JpaService<TodoItem, Long> {

    private TodoItemRepository repository;

    @Autowired
    public TodoItemServices(TodoItemRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<TodoItem> findByParentOid(Long parentOid) {
        return repository.findByParent_id(parentOid);
    }
}
