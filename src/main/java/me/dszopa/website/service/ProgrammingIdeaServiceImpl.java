package me.dszopa.website.service;

import me.dszopa.website.entity.ProgrammingIdea;
import me.dszopa.website.repo.ProgrammingIdeaRepo;
import me.dszopa.website.service.interfaces.ProgrammingIdeaService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by danny on 1/3/16.
 */
@Transactional(propagation = Propagation.SUPPORTS)
public class ProgrammingIdeaServiceImpl implements ProgrammingIdeaService {

    private ProgrammingIdeaRepo ideaRepo;

    public ProgrammingIdeaServiceImpl(ProgrammingIdeaRepo ideaRepo) {
        this.ideaRepo = ideaRepo;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveIdea(ProgrammingIdea idea) {
        ideaRepo.save(idea);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public ProgrammingIdea getIdea(Long id) {
        return ideaRepo.findOne(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void deleteIdea(Long id) {
        ideaRepo.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<ProgrammingIdea> getAllIdeas() {
        return ideaRepo.findAll();
    }
}
