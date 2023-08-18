package org.owasp.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/loans")

public class LoansController {

    //  Business Logic

    @GetMapping
    public Map<String, String> loans(){
        return Collections.singletonMap("msj", "loans");
    }

}
