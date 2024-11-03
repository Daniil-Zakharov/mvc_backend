package ru.nntu.Git.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BackendController {

    @Autowired
    private Backend backend;

    @PostMapping("/write")
    public void write(@RequestBody String line) {
        backend.write(line);
    }

    @GetMapping("/read")
    public String read() {
        return backend.read();
    }
}