package fr.an.testsprintboottest.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@EnableAutoConfiguration
@ComponentScan("fr.an.testsprintboottest")
@ActiveProfiles("profile2") // ??? does not work.. cf test classes!  
public class Ctx2AppConfiguration {

}
