package com.stadium.service.impl;

import com.stadium.dao.CourseMapper;
import com.stadium.entity.Course;
import com.stadium.service.CourseService;
import com.stadium.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Override
    public List<Course> getCourseList(int userid) {
        try (SqlSession sqlSession = MybatisUtil.getSession()){
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            return mapper.getCourseList(userid);
        }
    }

    @Override
    public void cancelCourse(String id) {
        try (SqlSession sqlSession = MybatisUtil.getSession()){
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            mapper.CancelCourse(id);
        }
    }

}
