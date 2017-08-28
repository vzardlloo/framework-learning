package org.vzard.run;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.vzard.po.City;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/**
 * Created by V-zar on 2017/8/27.
 */
public class Test {


    public void findUserByIdTest() throws IOException{
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入配置信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();


        City city = sqlSession.selectOne("test.findCityById",6);

        System.out.println(city);

        sqlSession.close();

    }



    public void findCityByNameTest() throws IOException{

        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<City> list = sqlSession.selectList("test.findCityByName",1000000);


            System.out.println(list);


        sqlSession.close();



    }


    public static void main(String[] args) throws IOException{
        Test test = new Test();
        test.findCityByNameTest();
        test.findUserByIdTest();
    }


}
