package me.dszopa.website.repo;

import me.dszopa.website.entity.PokemonLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by danny on 1/25/16.
 */
@Repository
@Transactional
public interface PokemonLogRepo extends JpaRepository<PokemonLog, Long> {
    /**
     * There is no need for implementation because we use the
     * JpaRepository class methods for everything.
     */
}
