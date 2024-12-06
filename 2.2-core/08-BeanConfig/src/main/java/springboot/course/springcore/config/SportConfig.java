package springboot.course.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.course.springcore.common.Coach;
import springboot.course.springcore.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("aqua")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
