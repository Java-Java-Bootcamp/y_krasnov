package ru.yourey.elections.mappers;

import org.mapstruct.Mapper;
import ru.yourey.elections.dto.CandidateDTO;
import ru.yourey.elections.entities.Candidate;

@Mapper(
        componentModel = "spring"
)
public interface CandidateMapper {

    CandidateDTO candidateToCandidateDto(Candidate candidate);
}
