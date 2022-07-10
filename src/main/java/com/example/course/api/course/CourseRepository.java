package com.example.course.api.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);



    /*
     * If we create an method then this interface can create the implementation by its own. We just need to focus on naming the method correctly
     *
     * How to Name the methods
     * If we need to find anything for particular name then method name will be "findByName(String name)"
     * Use camel casing for the same
     *
     */
}
