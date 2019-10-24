package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observable;
import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements Observable {
    private final String username;
    private final Queue<String> tasks;
    private final List<Observer> mentors;

    public TaskQueue(String username) {
        this.username = username;
        tasks = new ArrayDeque<>();
        mentors = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyObservers() {
        for(Observer mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(Observer mentor) {
        mentors.remove(mentor);
    }

    public String getUsername() {
        return username;
    }

    public Queue<String> getTasks() {
        return tasks;
    }
}
