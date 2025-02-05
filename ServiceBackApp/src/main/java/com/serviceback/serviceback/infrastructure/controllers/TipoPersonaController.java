package com.serviceback.serviceback.infrastructure.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceback.serviceback.application.services.ITipoPersona;
import com.serviceback.serviceback.domain.entities.TipoPersona;

@RestController
@RequestMapping("/api/tipopersonas")
public class TipoPersonaController {
    @Autowired
    private ITipoPersona service;

    @GetMapping
    public List<TipoPersona> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody TipoPersona tipoPersona) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tipoPersona));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody TipoPersona newTipoPersona) {
        return ResponseEntity.ok(service.update(id, newTipoPersona));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
    }
}
