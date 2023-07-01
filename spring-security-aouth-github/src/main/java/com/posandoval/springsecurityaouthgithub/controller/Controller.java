package com.posandoval.springsecurityaouthgithub.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller //Controlador MVC, redirige a una pagina html
public class Controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/page1")
    public String page1(){
        return "page1";
    }


}
