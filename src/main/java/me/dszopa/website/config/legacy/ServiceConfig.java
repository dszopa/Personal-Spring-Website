//package me.dszopa.website.config;
//
//import me.dszopa.website.repo.PokemonLogRepo;
//import me.dszopa.website.repo.PokemonTeamRepo;
//import me.dszopa.website.repo.ProgrammingIdeaRepo;
//import me.dszopa.website.service.PokemonLogServiceImpl;
//import me.dszopa.website.service.PokemonTeamServiceImpl;
//import me.dszopa.website.service.ProgrammingIdeaServiceImpl;
//import me.dszopa.website.service.interfaces.PokemonLogService;
//import me.dszopa.website.service.interfaces.PokemonTeamService;
//import me.dszopa.website.service.interfaces.ProgrammingIdeaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by danny on 1/3/16.
// */
//@Configuration
//public class ServiceConfig {
//
//    //Autowires
//    @Autowired
//    private ProgrammingIdeaRepo ideaRepo;
//    @Autowired
//    private PokemonTeamRepo pokemonTeamRepo;
//    @Autowired
//    private PokemonLogRepo pokemonLogRepo;
//
//    //Beans
//    @Bean
//    public ProgrammingIdeaService programmingIdeaService() {
//        return new ProgrammingIdeaServiceImpl(ideaRepo);
//    }
//
//    @Bean
//    public PokemonTeamService pokemonTeamService() {
//        return new PokemonTeamServiceImpl(pokemonTeamRepo);
//    }
//
//    @Bean
//    public PokemonLogService pokemonLogService() {
//        return new PokemonLogServiceImpl(pokemonLogRepo);
//    }
//}
