package org.owasp.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/balance")

public class BalanceController {

    //  Business Logic

    @GetMapping
    public Map<String, String> balance(){
        return Collections.singletonMap("msj", "balance");
    }

}
