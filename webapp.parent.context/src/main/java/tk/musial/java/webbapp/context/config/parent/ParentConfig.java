package tk.musial.java.webbapp.context.config.parent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author Grzegorz Musiał.
 */
@Configuration
public class ParentConfig {

    @PostConstruct
    public void postConstructLog() {
        System.out.println("parent context class loaded.");
    }


    @Bean
    public Something sth() {
        return new Something();
    }

    public static class Something {

    }
}
