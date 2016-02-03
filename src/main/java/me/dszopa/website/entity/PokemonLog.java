package me.dszopa.website.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by danny on 1/25/16.
 */
@Entity
@Table(name = "pokemon_logs")
public class PokemonLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String teamUsed;

    @NotNull
    private String opponentStarters;

    @NotNull
    private String opponentOthers;

    @NotNull
    private String myStarters;

    @NotNull
    private String myOthers;

    @NotNull
    private String result;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeamUsed() {
        return teamUsed;
    }

    public void setTeamUsed(String teamUsed) {
        this.teamUsed = teamUsed;
    }

    public String getOpponentStarters() {
        return opponentStarters;
    }

    public void setOpponentStarters(String opponentStarters) {
        this.opponentStarters = opponentStarters;
    }

    public String getOpponentOthers() {
        return opponentOthers;
    }

    public void setOpponentOthers(String opponentOthers) {
        this.opponentOthers = opponentOthers;
    }

    public String getMyStarters() {
        return myStarters;
    }

    public void setMyStarters(String myStarters) {
        this.myStarters = myStarters;
    }

    public String getMyOthers() {
        return myOthers;
    }

    public void setMyOthers(String myOthers) {
        this.myOthers = myOthers;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
