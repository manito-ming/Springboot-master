package org.example.springboot.mybatis.service;


import org.example.springboot.mybatis.domain.City;

/**
 * 城市业务逻辑接口类
 *
 * Created by jw on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
