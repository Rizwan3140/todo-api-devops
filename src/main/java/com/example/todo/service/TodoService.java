package com.example.todo.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TodoService {
    private Map<Integer, String> todos = new HashMap<>();
    private int currentId = 1;

    public List<String> getAllTodos() {
        return new ArrayList<>(todos.values());
    }

    public String getTodoById(int id) {
        return todos.get(id);
    }

    public int addTodo(String todoText) {
        todos.put(currentId, todoText);
        return currentId++;
    }

    public boolean deleteTodo(int id) {
        return todos.remove(id) != null;
    }

    public boolean updateTodo(int id, String newText) {
        if (todos.containsKey(id)) {
            todos.put(id, newText);
            return true;
        }
        return false;
    }
}
