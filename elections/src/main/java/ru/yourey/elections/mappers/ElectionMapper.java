package ru.yourey.elections.mappers;

import org.mapstruct.Mapper;
import ru.yourey.elections.dto.ElectionDTO;
import ru.yourey.elections.entities.Election;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface ElectionMapper {

    List<ElectionDTO> electionsListToElectionDTOList(List<Election> elections);

    ElectionDTO electionToElectionDTO(Election elections);
}
