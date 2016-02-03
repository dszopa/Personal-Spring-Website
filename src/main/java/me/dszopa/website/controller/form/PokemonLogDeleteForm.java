package me.dszopa.website.controller.form;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danny on 2/2/16.
 */
public class PokemonLogDeleteForm {

    private List<Long> logIds = new ArrayList<>();

    public List<Long> getLogIds() {
        return logIds;
    }

    public void setLogIds(List<Long> logIds) {
        this.logIds = logIds;
    }
}
