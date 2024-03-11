package com.example.controllerswagger.Controller;

import com.example.controllerswagger.Service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @Autowired
    private NameService nameService;

    @GetMapping("/returnName")
    public ResponseEntity<String> getName(@RequestParam String name){
        return ResponseEntity.ok().body(name);
    }

    @PostMapping("/reverse")
    public ResponseEntity<StringBuilder> reverseName(@RequestParam String name){
        StringBuilder reversedName = nameService.reverseName(name);
        return ResponseEntity.ok().body(reversedName);
    }
}
