import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ssmTest.dao.PersonDao;
import org.ssmTest.entity.Person;
import org.ssmTest.service.PersonService;
import org.ssmTest.util.MybatisTool;

import java.util.List;

/**
 * @author stary
 * @date 2018/8/31 下午8:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-config.xml")
public class mybatisTest {

    @Autowired
    PersonService personService;

    List<Person> list;

//    @Test
//    public void mybatisTest(){
//        //通过MybatisTool获得SqlSession
//        SqlSession sqlSession = MybatisTool.getSession();
//        //通过SqlSession获得PersonDao接口的映射，从而获得其实例对象
//        PersonDao personDao = sqlSession.getMapper(PersonDao.class);
//        list = personDao.queryAll();
//
//        for (Person person : list)
//            System.out.println(person.toString());
//    }

    @Test
    public void springTest(){

        list=personService.queryAll();

        for (Person p : list)
            System.out.println(p.toString());

    }
}
