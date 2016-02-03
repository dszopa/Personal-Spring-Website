package me.dszopa.website.service;

import me.dszopa.website.entity.PokemonTeam;
import me.dszopa.website.repo.PokemonTeamRepo;
import me.dszopa.website.service.interfaces.PokemonTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dszopa on 1/15/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class PokemonTeamServiceImpl implements PokemonTeamService {

    @Autowired
    private PokemonTeamRepo teamRepo;

//    public PokemonTeamServiceImpl(PokemonTeamRepo teamRepo) {
//        this.teamRepo = teamRepo;
//    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveTeam(PokemonTeam team) {
        teamRepo.save(team);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public PokemonTeam getTeam(Long id) {
        return teamRepo.findOne(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteTeam(Long id) {
        teamRepo.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<PokemonTeam> getAllTeams() {
        return teamRepo.findAll();
    }
}
