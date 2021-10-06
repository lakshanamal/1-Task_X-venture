package com.task.selftask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class MathController {
    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @PostMapping("/add")
    public ResponseEntity<Map<String,Integer>>  addTwoNumber(@RequestBody MathModel mathModel){
        Integer a= mathModel.getA();
        Integer b=mathModel.getB();
        Map<String, Integer> map = new HashMap<>();
        map.put("answer",mathService.addTwoNumber(a,b));
        return ResponseEntity.ok(map);
    }

    @GetMapping("/add/{a}/{b}")
    public ResponseEntity<Map<String,Integer>> add(@PathVariable("a") Integer a,@PathVariable("b") Integer b){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("answer",mathService.add(a,b));
        return ResponseEntity.ok().body(map);
    }


}
