package me.dszopa.website.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by danny on 12/29/15.
 */
@Entity
@Table(name = "programming_ideas")
public class ProgrammingIdea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String idea;

    public ProgrammingIdea() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }
}
