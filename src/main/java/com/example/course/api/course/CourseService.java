package com.example.course.api.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String id) {
//        List<Course> courses = new ArrayList<>();
        return courseRepository.findByTopicId(id);
//        courseRepository.findAll().forEach(courses::add);
//        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).isPresent() ? courseRepository.findById(id).get() : null;
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
        System.out.println("Course added successfully in course list! :)");
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
