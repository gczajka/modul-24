package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observable;
import com.kodilla.patterns2.observer.forum.Observer;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public void update(Observable observable) {
        TaskQueue queue = (TaskQueue) observable;
        System.out.println(mentorName + ": New tasks in queue of user: " + queue.getUsername() + "\n" + " (total: " + queue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
