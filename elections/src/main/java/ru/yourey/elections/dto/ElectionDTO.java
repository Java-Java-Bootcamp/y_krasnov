package ru.yourey.elections.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.yourey.elections.entities.Candidate;

import java.util.List;

@Getter
@Setter
public class ElectionDTO {

    @JsonProperty("election_id")
    private int id;

    @JsonProperty("election_name")
    private String electionName;

    @JsonProperty("candidates")
    private List<CandidateDTO> candidates;

}
