package com.homecenter.almacen.controller;

import com.homecenter.almacen.entity.Almacen;
import com.homecenter.almacen.service.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenRestController {
    @Autowired
    private AlmacenService almacenService;

    @GetMapping("/")
    List<Almacen> get(){return almacenService.getAllAlmacens(); }
    @PostMapping("/")
    ResponseEntity<Almacen> post(@RequestBody Almacen almacen){
        return  new ResponseEntity<Almacen>(almacenService.save(almacen), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    ResponseEntity<Almacen> put(@RequestBody Almacen user,@PathVariable Long id){
        return  new ResponseEntity<Almacen>(almacenService.update(user,id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity delete(@PathVariable Long id){
        almacenService.delete(id);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
