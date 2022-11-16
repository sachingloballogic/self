package com.example.self.Controller;

import com.example.self.Entity.Service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class customerController {

    @Autowired
    private customerService customerService;


}
