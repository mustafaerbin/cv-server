package com.tr.cv.repository;

import com.tr.cv.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kamilbukum on 06/03/2017.
 */
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
