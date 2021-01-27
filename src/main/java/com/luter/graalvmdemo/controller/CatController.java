package com.luter.graalvmdemo.controller;

import com.luter.graalvmdemo.dto.CatDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@Slf4j
@RequestMapping("/cats")
public class CatController {


    @PostMapping
    public CatDTO save(@RequestBody @Validated CatDTO param) {
        return param;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        return ResponseEntity.ok("Success" + id);
    }

    @PutMapping
    public CatDTO update(@RequestBody @Validated CatDTO param) {
        return param;
    }

    @GetMapping
    public ResponseEntity<String> list(CatDTO param, Pageable page) {
        return ResponseEntity.ok("列表查看");
    }

    @GetMapping("/{id}")
    public CatDTO getById(@PathVariable String id) {
        return new CatDTO();
    }

}
