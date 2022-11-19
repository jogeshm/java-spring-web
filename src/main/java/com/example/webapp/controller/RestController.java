package com.example.webapp.controller;

import com.example.webapp.dto.ExampleDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class RestController {

    @ResponseBody
    @GetMapping("/api/hello")
    public List<ExampleDTO> helloWorld(){
        log.info("inside API $$$$");
        ArrayList<ExampleDTO> list = new ArrayList<ExampleDTO>();
        list.add(new ExampleDTO("Jogesh","Value1","Value2"));

        return list;
    }

}
