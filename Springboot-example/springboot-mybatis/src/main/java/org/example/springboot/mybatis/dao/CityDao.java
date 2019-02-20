package org.example.springboot.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.example.springboot.mybatis.domain.City;


/**
 * 城市 DAO 接口类
 *
 * Created by jw on 07/02/2017.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */           ////这个方法对应Mapper里面的写的id
    City findByName(@Param("cityName") String cityName);
}
