package org.owasp.spring_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/accounts")

public class AccountsController {

    //  Business Logic

    @GetMapping
    public Map<String, String> accounts(){
        return Collections.singletonMap("msj", "accounts");
    }


}
