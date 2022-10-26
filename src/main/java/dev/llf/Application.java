package dev.llf;

import dev.llf.config.AppConfig;
import dev.llf.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // CourseService service = new CourseService();
        // System.out.println(service.list());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService service = applicationContext.getBean("courseService", CourseService.class);
        System.out.println(service.list());
    }
}
