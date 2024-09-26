package com.example.projecttounderstandterminal.gretting;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingsController {

    private final GreetingsRepository greetingsRepository;

    public GreetingsController(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    }

    @GetMapping("/greetings")
    public ResponseEntity<Greetings> greet(){
        Greetings greet = new Greetings("Heyoo");
        greetingsRepository.save(greet);

        return new ResponseEntity<>(greet, HttpStatus.OK);
    }
}
