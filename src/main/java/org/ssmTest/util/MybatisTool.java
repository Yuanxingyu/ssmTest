package org.ssmTest.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author stary
 * @date 2018/8/31 下午11:03
 */

/**
 * ssm测试时将此类的内容注释掉，
 * 因为其内容都是静态代码，会在jvm运行时自动加载
 * 但是根本无需配置，浪费资源
 */
public class MybatisTool {
//    private static SqlSessionFactory sessionFactory;
//
//    static {
//
//        try {
//            //通过mybatis提供的Resources类加载mybatis配置文件
//            Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
//            //构件session工厂
//            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static SqlSession getSession(){
//        return sessionFactory.openSession();
//    }
}
