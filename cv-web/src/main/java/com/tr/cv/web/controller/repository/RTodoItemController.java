package com.tr.cv.web.controller.repository;

import com.tr.cv.domain.TodoItem;
import com.tr.cv.services.TodoItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kamilbukum on 06/03/2017.
 */
@RestController
@RequestMapping(value = "repository-todo-items")
public class RTodoItemController {
    @Autowired
    private TodoItemServices todoItemServices;

    @RequestMapping(method = RequestMethod.POST)
    public TodoItem create(@RequestBody TodoItem todoItem) {
        return todoItemServices.create(todoItem);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "{oid}")
    public TodoItem delete(@PathVariable("oid") Long id) {
        return todoItemServices.delete(id);
    }
}
