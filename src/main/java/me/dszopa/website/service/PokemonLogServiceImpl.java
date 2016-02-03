package me.dszopa.website.service;

import me.dszopa.website.entity.PokemonLog;
import me.dszopa.website.repo.PokemonLogRepo;
import me.dszopa.website.service.interfaces.PokemonLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by danny on 1/25/16.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class PokemonLogServiceImpl implements PokemonLogService {

    @Autowired
    private PokemonLogRepo pokemonLogRepo;

//    public PokemonLogServiceImpl(PokemonLogRepo pokemonLogRepo) {
//        this.pokemonLogRepo = pokemonLogRepo;
//    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveLog(PokemonLog log) {
        pokemonLogRepo.save(log);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PokemonLog getLog(Long id) {
        return pokemonLogRepo.findOne(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteLog(Long id) {
        pokemonLogRepo.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<PokemonLog> getAllLogs() {
        return pokemonLogRepo.findAll();
    }
}
