package me.dszopa.website.repo;

import me.dszopa.website.entity.ProgrammingIdea;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by danny on 12/30/15.
 */
@Transactional
public interface ProgrammingIdeaDao extends CrudRepository<ProgrammingIdea, Long> {

    /**
     * There is no need for implementation because we use the
     * CrudRepository class methods for everything.
     */
}
