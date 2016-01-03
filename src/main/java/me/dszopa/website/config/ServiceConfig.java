package me.dszopa.website.config;

import me.dszopa.website.repo.ProgrammingIdeaRepo;
import me.dszopa.website.service.ProgrammingIdeaServiceImpl;
import me.dszopa.website.service.interfaces.ProgrammingIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by danny on 1/3/16.
 */
@Configuration
public class ServiceConfig {

    //Autowires
    @Autowired
    private ProgrammingIdeaRepo ideaRepo;

    //Beans
    @Bean
    public ProgrammingIdeaService programmingIdeaService() {
        return new ProgrammingIdeaServiceImpl(ideaRepo);
    }
}
