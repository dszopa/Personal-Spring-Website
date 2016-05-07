package me.dszopa.website;

//import me.dszopa.website.config.ControllerConfig;
//import me.dszopa.website.config.RepoConfig;
//import me.dszopa.website.config.ServiceConfig;
//import me.dszopa.website.config.WebSecurityConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by danny on 12/23/15.
 */
@EnableAutoConfiguration
@ComponentScan
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
//        SpringApplication.run(new Object[] {Application.class, RepoConfig.class, ServiceConfig.class,
//                ControllerConfig.class, WebSecurityConfig.class}, args);

        SpringApplication.run(new Object[] {Application.class}, args);

//        SpringApplication.run(new Object[] {Application.class, WebSecurityConfig.class}, args);
    }
}
