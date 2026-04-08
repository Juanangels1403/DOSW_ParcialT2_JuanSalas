package edu.dosw.parcial.controller;

import edu.dosw.parcial.dto.EntidadDTO;
import edu.dosw.parcial.service.EntidadService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades")
public class EntidadController {

    private final EntidadService entidadService;

    public EntidadController(EntidadService entidadService) {
        this.entidadService = entidadService;
    }

    @GetMapping
    public ResponseEntity<List<EntidadDTO>> getAll() {
        return ResponseEntity.ok(entidadService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntidadDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(entidadService.findById(id));
    }

    @PostMapping
    public ResponseEntity<EntidadDTO> create(@Valid @RequestBody EntidadDTO dto) {
        return new ResponseEntity<>(entidadService.save(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntidadDTO> update(@PathVariable Long id, @Valid @RequestBody EntidadDTO dto) {
        return ResponseEntity.ok(entidadService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        entidadService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}