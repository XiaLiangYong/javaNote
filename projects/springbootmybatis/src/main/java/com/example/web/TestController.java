package com.example.web;

import com.example.dto.HotelDto;
import com.example.mapper.HotelDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alibeibei on 2017/6/30.
 */
@RestController
@RequestMapping({"/home"})
public class TestController {
    @Autowired
    public HotelDtoMapper hotel;


    @RequestMapping("/getUserInfo")
    @ResponseBody
    public List<HotelDto> getUserInfo() {
        System.out.println("hello");
        List<HotelDto> hotelList = hotel.findByCountry("成都");
        return hotelList;
    }
}
