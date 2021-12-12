package be.infernalwhale.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/login")
    public ResponseEntity doLogin() {
        return ResponseEntity.ok("Hello from the login controller");
    }

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello World, basic security");
    }

    @GetMapping("/restricted")
    public ResponseEntity restrictedMethod() {
        return ResponseEntity.ok("Hello World, restricted access");
    }
}
