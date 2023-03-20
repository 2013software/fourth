package com.stadium.servlet.student;

import com.stadium.entity.User;
import com.stadium.entity.Venue;
import com.stadium.service.VenueService;
import com.stadium.service.impl.VenueServiceImpl;
import org.thymeleaf.context.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/select-venue")
public class SelectVenueServlet extends HttpServlet {
    VenueService service;
    @Override
    public void init() throws ServletException {
        service = new VenueServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
//        User user = (User) req.getSession().getAttribute("user");
        String id = req.getParameter("id");
        String userid = req.getParameter("userid");
        Venue venue = new Venue();
//        int userid = user.getUserid();
        venue.setId(Integer.parseInt(id));
        venue.setUserid(userid);
        service.selectVenue(venue);
        req.getRequestDispatcher("venue").forward(req,resp);
    }
}
