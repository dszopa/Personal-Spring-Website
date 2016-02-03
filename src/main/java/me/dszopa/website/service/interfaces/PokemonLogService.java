package me.dszopa.website.service.interfaces;

import me.dszopa.website.entity.PokemonLog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by danny on 1/25/16.
 */
public interface PokemonLogService {

    @Transactional(propagation = Propagation.REQUIRED)
    void saveLog(PokemonLog log);

    @Transactional(propagation = Propagation.REQUIRED)
    PokemonLog getLog(Long id);

    @Transactional(propagation = Propagation.REQUIRED)
    void deleteLog(Long id);

    @Transactional(propagation = Propagation.REQUIRED)
    List<PokemonLog> getAllLogs();
}
