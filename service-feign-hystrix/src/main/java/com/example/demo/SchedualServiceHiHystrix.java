package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @author 01121697 彭坚
 * @describe TODO
 * @data 2017/12/27/13:51
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
