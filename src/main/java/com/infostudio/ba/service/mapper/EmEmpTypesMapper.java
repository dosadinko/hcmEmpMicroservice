package com.infostudio.ba.service.mapper;

import com.infostudio.ba.domain.*;
import com.infostudio.ba.service.dto.EmEmpTypesDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity EmEmpTypes and its DTO EmEmpTypesDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface EmEmpTypesMapper extends EntityMapper<EmEmpTypesDTO, EmEmpTypes> {



    default EmEmpTypes fromId(Long id) {
        if (id == null) {
            return null;
        }
        EmEmpTypes emEmpTypes = new EmEmpTypes();
        emEmpTypes.setId(id);
        return emEmpTypes;
    }
}
