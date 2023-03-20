package com.stadium.service.impl;

import com.stadium.dao.StVenueMapper;
import com.stadium.dao.VenueMapper;
import com.stadium.entity.Venue;
import com.stadium.service.VenueService;
import com.stadium.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.http.HttpSession;
import java.util.List;

public class VenueServiceImpl implements VenueService {

    @Override
    public List<Venue> getVenueList() {
        try (SqlSession sqlSession = MybatisUtil.getSession()){
            VenueMapper mapper = sqlSession.getMapper(VenueMapper.class);
            return  mapper.getVenueList();
        }
    }


    @Override
    public void selectVenue(Venue venue) {
        try (SqlSession sqlSession = MybatisUtil.getSession()){
            VenueMapper mapper = sqlSession.getMapper(VenueMapper.class);
            mapper.SelectVenue(venue);
        }
    }

}
