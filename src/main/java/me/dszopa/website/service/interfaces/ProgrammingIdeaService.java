package me.dszopa.website.service.interfaces;


import me.dszopa.website.entity.ProgrammingIdea;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProgrammingIdeaService {

    @Transactional(propagation = Propagation.REQUIRED)
    void saveIdea(ProgrammingIdea idea);

    @Transactional(propagation = Propagation.REQUIRED)
    ProgrammingIdea getIdea(Long id);

    @Transactional(propagation = Propagation.REQUIRED)
    void deleteIdea(Long id);

    @Transactional(propagation = Propagation.REQUIRED)
    List<ProgrammingIdea> getAllIdeas();

}