package com.example.server.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/dang-ky")
public class DangKy {

    @GetMapping(value = "/get-all")
    public void getAll() {

    }

    @PostMapping(value = "/create")
    public void create() {

    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody int id) {

    }
}
