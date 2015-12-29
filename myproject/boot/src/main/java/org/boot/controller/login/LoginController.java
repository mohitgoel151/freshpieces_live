package org.boot.controller.login;

import org.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("org.login.service")
@RestController
@RequestMapping("login/")
public class LoginController {
    
    @Autowired
    private LoginService loginService;

}
