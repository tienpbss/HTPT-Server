package com.example.server.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/mon-hoc")
public class MonHoc {

    @GetMapping(value = "/get-all")
    public void getAll() {

    }

    @PostMapping(value = "/create")
    public void create() {

    }

    @PutMapping(value = "/update")
    public void update() {

    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody int id) {

    }
}
