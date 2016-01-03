package me.dszopa.website.repo;

import me.dszopa.website.entity.ProgrammingIdea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by danny on 12/30/15.
 */
@Transactional
public interface ProgrammingIdeaRepo extends JpaRepository<ProgrammingIdea, Long> {

    /**
     * There is no need for implementation because we use the
     * JpaRepository class methods for everything.
     */
}
