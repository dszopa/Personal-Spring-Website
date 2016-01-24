package me.dszopa.website.service.interfaces;


import me.dszopa.website.entity.PokemonTeam;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dszopa on 1/15/16.
 */
public interface PokemonTeamService {

    @Transactional(propagation = Propagation.REQUIRED)
    void saveTeam(PokemonTeam team);

    @Transactional(propagation = Propagation.REQUIRED)
    PokemonTeam getTeam(Long id);

    @Transactional(propagation = Propagation.REQUIRED)
    void deleteTeam(Long id);

    @Transactional(propagation = Propagation.REQUIRED)
    List<PokemonTeam> getAllTeams();
}
