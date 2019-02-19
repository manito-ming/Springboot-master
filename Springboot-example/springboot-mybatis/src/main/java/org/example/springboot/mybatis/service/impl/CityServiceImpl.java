package org.example.springboot.mybatis.service.impl;


import org.example.springboot.mybatis.dao.CityDao;
import org.example.springboot.mybatis.domain.City;
import org.example.springboot.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}
