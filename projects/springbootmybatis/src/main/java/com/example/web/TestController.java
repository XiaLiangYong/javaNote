package com.example.web;

import com.example.dto.HotelDto;
import com.example.mapper.HotelDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alibeibei on 2017/6/30.
 */
@RestController
@RequestMapping({"/home"})
public class TestController {

    @Autowired
    HotelDtoMapper hotelMap;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String user() {
        HotelDto hotel = hotelMap.findByCountry("成都");
        return hotel.getName();
    }
}
