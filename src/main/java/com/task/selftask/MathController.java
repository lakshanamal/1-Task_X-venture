package com.task.selftask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class MathController {
    @Autowired
    private MathService mathService;

    @PostMapping("/add")
    public ResponseEntity<Map<String,Integer>>  addTwoNumber(@RequestBody MathModel mathModel){
        Integer a= mathModel.getA();
        Integer b=mathModel.getB();
        Map<String, Integer> map = new HashMap<>();
        map.put("answer",mathService.addTwoNumber(a,b));
        return ResponseEntity.ok(map);
    }
}
