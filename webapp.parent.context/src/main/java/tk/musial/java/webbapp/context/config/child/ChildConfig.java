package tk.musial.java.webbapp.context.config.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.musial.java.webbapp.context.config.parent.ParentConfig;

import javax.annotation.PostConstruct;

/**
 * @author Grzegorz Musiał.
 */
@Configuration
public class ChildConfig {

    @Autowired
    private ParentConfig.Something sth;

    @PostConstruct
    public void postConstructLog() {
        System.out.println("child context class loaded.");
    }

}
