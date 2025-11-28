package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/list")
   public List<Integer> list(){
        return new ArrayList<>(List.of(1,2,3,4));
   }
   @GetMapping("/name")
   public String userName(){
        return  "gopi";
   }
   @GetMapping("/names")
    public List <String> userNames(){
        return  new ArrayList<>(List.of("gopi","hlk"));
    }






}
