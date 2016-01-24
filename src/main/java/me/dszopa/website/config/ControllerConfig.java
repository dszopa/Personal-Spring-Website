package me.dszopa.website.config;

import me.dszopa.website.controller.*;
import me.dszopa.website.service.interfaces.PokemonTeamService;
import me.dszopa.website.service.interfaces.ProgrammingIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by danny on 1/3/16.
 */
@EnableWebMvc
@Configuration
public class ControllerConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private ProgrammingIdeaService ideaService;
    @Autowired
    private PokemonTeamService pokemonTeamService;

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/" };

    // Use for allowing paths like static, public, etc to be configured for resource use.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/webjars/**")) {
            registry.addResourceHandler("/webjars/**").addResourceLocations(
                    "classpath:/META-INF/resources/webjars/");
        }
        if (!registry.hasMappingForPattern("/**")) {
            registry.addResourceHandler("/**").addResourceLocations(
                    CLASSPATH_RESOURCE_LOCATIONS);
        }
    }

    @Bean
    public AboutController aboutController() {
        return new AboutController();
    }

    @Bean
    public IdeaBoardController ideaBoardController() {
        return new IdeaBoardController(ideaService);
    }

    @Bean
    public IndexController indexController() {
        return new IndexController();
    }

    @Bean
    public ProjectsController projectsController() {
        return new ProjectsController();
    }

    @Bean
    public SplitCalculatorController splitCalculatorController() {
        return new SplitCalculatorController();
    }

    @Bean
    public PokemonTeamsController pokemonTeamsController() {
        return new PokemonTeamsController(pokemonTeamService);
    }

    @Bean
    public TestController testController() {
        return new TestController();
    }
}
