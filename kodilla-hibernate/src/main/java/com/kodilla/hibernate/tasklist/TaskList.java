package com.kodilla.hibernate.tasklist;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Table(name="TASKLISTS")
@Entity
public class TaskList {
    int id;
    String listName;
    String description;

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    public TaskList() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID")
    public int getId() {
        return id;
    }

    @Column(name="LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
