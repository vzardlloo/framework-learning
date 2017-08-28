package org.vzard.dao;

import org.vzard.po.City;

import java.util.List;

/**
 * Created by V-zar on 2017/8/27.
 */
public interface CityDao {


    //根据id查询用户信息
    public City findCityById(int id) throws Exception;

    //根据用户名列查询用户列表
    public List<City> findCityByName(String name) throws Exception;

    //添加用户信息
    public void insertCity(City city) throws Exception;

    //删除用户信息
    public void deleteCity(int id) throws Exception;

}
