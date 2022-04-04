package ru.yourey.elections.mappers;

import org.mapstruct.Mapper;
import ru.yourey.elections.dto.CandidateDTO;
import ru.yourey.elections.entities.Candidate;

import java.util.List;

@Mapper(
        componentModel = "spring"
)
public interface CandidateMapper {

    CandidateDTO candidateToCandidateDTO(Candidate candidate);

    List<CandidateDTO> candidateListToCandidateDTOList (List<Candidate> candidate);
}
