package org.ssmTest.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author stary
 * @date 2018/8/31 下午4:00
 */

@Getter
@Setter
@NoArgsConstructor
public class Person {

    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    public String toString() {
        return name+"  "+sex+"  "+age;
    }
}
