package edu.dosw.parcial.mapper;

import edu.dosw.parcial.dto.EntidadDTO;
import edu.dosw.parcial.entity.Entidad;
import org.springframework.stereotype.Component;

@Component
public class EntidadMapper {

    public EntidadDTO toDTO(Entidad entidad) {
        if (entidad == null) {
            return null;
        }

        return new EntidadDTO(
                entidad.getId(),
                entidad.getNombre(),
                entidad.getDescripcion()
        );
    }

    public Entidad toEntity(EntidadDTO dto) {
        if (dto == null) {
            return null;
        }

        Entidad entidad = new Entidad();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setDescripcion(dto.getDescripcion());
        return entidad;
    }
}