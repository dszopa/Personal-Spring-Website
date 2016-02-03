package me.dszopa.website.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by dszopa on 1/15/16.
 */
@Entity
@Table(name = "pokemon_teams")
public class PokemonTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String teamName;

    @NotNull
    @Column(length = 20000)
    private String teamData;

    public PokemonTeam() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamData() {
        return teamData;
    }

    public void setTeamData(String teamData) {
        this.teamData = teamData;
    }
}
