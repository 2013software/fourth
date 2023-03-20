package com.stadium.servlet.course;

import com.stadium.service.CourseService;
import com.stadium.service.impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cancel-course")
public class CancelCourseServlet extends HttpServlet {
    CourseService service;

    @Override
    public void init() throws ServletException {
        service = new CourseServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        service.cancelCourse(id);
        resp.sendRedirect("course");
    }
}
