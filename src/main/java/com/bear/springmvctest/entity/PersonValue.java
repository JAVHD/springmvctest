package com.bear.springmvctest.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/28 上午10:57
 * Description:
 */

@Data
@Component
public class PersonValue {

    private String name;

    @Value("#{18}")
    private Integer age;

    @Override
    public String toString() {
        return "PersonValue{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
