package com.task.selftask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MathController {
    @Autowired
    private MathService mathService;

    @PostMapping("/add")
    public Integer  addTwoNumber(@RequestBody MathModel mathModel){
        Integer a= mathModel.getA();
        Integer b=mathModel.getB();
        return mathService.addTwoNumber(a,b);
    }
}
