package com.example.mapper;


import java.util.List;

import com.example.dto.HotelDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * Created by alibeibei on 2017/6/30.
 */
@Mapper
public interface HotelDtoMapper {
    public List<HotelDto> findByCountry(@Param("name") String country);
}
