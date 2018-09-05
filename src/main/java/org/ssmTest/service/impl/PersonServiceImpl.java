package org.ssmTest.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssmTest.dao.PersonDao;
import org.ssmTest.entity.Person;
import org.ssmTest.service.PersonService;
import org.ssmTest.util.MybatisTool;

import java.util.List;

/**
 * @author stary
 * @date 2018/9/2 下午5:03
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;//ssmTest整合测试

    @Override
    public List<Person> queryAll() {
        List<Person> list;

//        //通过MybatisTool获得SqlSession
//        SqlSession sqlSession = MybatisTool.getSession();
//        //通过SqlSession获得PersonDao接口的映射，从而获得其实例对象
//        PersonDao personDao = sqlSession.getMapper(PersonDao.class);
        list = personDao.queryAll();

        return list;
    }
}
