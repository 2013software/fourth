package com.stadium.service;

import com.stadium.entity.Course;
import com.stadium.entity.User;

import java.util.List;

public interface CourseService {
    List<Course> getCourseList(int userid);
    void cancelCourse(String id);
}
