package dev.llf.service;

import dev.llf.model.Course;
import dev.llf.repository.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CourseService implements CrudService<Course> {
    private CourseRepository repository;

    public CourseService(CourseRepository courseRepository) {
        repository = courseRepository;
    }

    @Override
    public List list() {
        return repository.findAll();
    }

    @Override
    public Course create(Course o) {
        return null;
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
