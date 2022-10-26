package dev.llf.repository;

import java.util.List;
import java.util.ArrayList;
import dev.llf.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository implements CrudRepository<Course> {
    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1,
                "Getting Started with Spring Boot 2",
                "Learn how to build real applications with Spring Boot 2",
                "https://springframwork.com");
        courses.add(springBoot);
        return courses;
    }
}
