package com.example.server.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/chuyen-nganh")
public class ChuyenNganh {

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
