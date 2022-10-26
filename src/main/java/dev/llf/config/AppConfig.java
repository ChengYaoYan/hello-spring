package dev.llf.config;

import dev.llf.repository.CourseRepository;
import dev.llf.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.llf")
public class AppConfig {
//    @Bean("courseRepository")
//    public CourseRepository getCourseRepository() {
//        return new CourseRepository();
//    }
//
//
//    @Bean("courseService")
//    public CourseService getCourseService() {
//        return new CourseService(getCourseRepository());
//    }

}
