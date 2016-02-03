package me.dszopa.website.controller.form;

/**
 * Created by danny on 1/25/16.
 */
public class PokemonLogAddForm {

    private String teamUsed;

    private String opponentStarters;

    private String opponentOthers;

    private String myStarters;

    private String myOthers;

    private String result;

    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
