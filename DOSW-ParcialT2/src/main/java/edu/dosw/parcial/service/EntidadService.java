package edu.dosw.parcial.service;

import edu.dosw.parcial.dto.EntidadDTO;

import java.util.List;

public interface EntidadService {

    List<EntidadDTO> findAll();

    EntidadDTO findById(Long id);

    EntidadDTO save(EntidadDTO dto);

    EntidadDTO update(Long id, EntidadDTO dto);

    void deleteById(Long id);
}