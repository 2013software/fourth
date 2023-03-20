package com.stadium.dao;

import com.stadium.entity.Course;
import com.stadium.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CourseMapper {

    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "courseid", property = "course_id"),
            @Result(column = "course_name", property = "course_name"),
            @Result(column = "time", property = "time"),
            @Result(column = "venue_name", property = "location")
    })
    @Select("select * from course_state, course, venue, time " +
            "where course_state.courseid = course.id " +
            "and course.venueid = venue.id " +
            "and course.course_time = time.id " +
            "and course_state.userid = #{userid}")
    List<Course> getCourseList(int userid);

    @Delete("delete from course_state where id = #{id}")
    void CancelCourse(String id);
}
