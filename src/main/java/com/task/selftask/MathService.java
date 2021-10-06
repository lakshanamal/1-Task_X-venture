package com.task.selftask;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public Integer addTwoNumber(Integer a, Integer b) {
        return  a+b;
    }
    public Integer add(Integer a,Integer b){
        return a+b;
    }
}
