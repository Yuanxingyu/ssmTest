package org.ssmTest.service;

import org.ssmTest.entity.Person;
import java.util.List;

/**
 * @author stary
 * @date 2018/9/1 下午11:18
 */
public interface PersonService {
    List<Person> queryAll();
}
