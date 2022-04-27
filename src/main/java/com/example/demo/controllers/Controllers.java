package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/hello")
public class Controllers {

   @PostMapping(path = "/{name}")
   public String sayHello(@PathVariable("name") String name) {
      return "Hello soy " + name + " y esta es mi primera API";
   }

   @GetMapping(path = "/goodbye")
   public String goodbye() {
      return "Hasta luego!!";
   }

}
