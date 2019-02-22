package org.example.springboot.mybatis.controller;



import org.example.springboot.mybatis.domain.City;
import org.example.springboot.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)  //在网站上输入cityName
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    //第二种方法
//        @Autowired
//    private CityDao cityDao;
//    @GetMapping(value="/city")
//    public City findOneCity(@RequestParam(value = "cityName") String cityName){
//        return cityDao.findByName(cityName);
//    }

}
