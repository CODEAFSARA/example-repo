
package org.example.service;

import org.example.dto.Course;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    // Create
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Read all
    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    // Read by ID
    public Optional<Course> getCourseById(int id) {
        return courses.stream()
                .filter(course -> course.getId() == id)
                .findFirst();
    }

    // Update
    public boolean updateCourse(int id, Course updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == id) {
                courses.set(i, updatedCourse);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean deleteCourse(int id) {
        return courses.removeIf(course -> course.getId() == id);
    }
}
