package ru.yourey.elections.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandidateDTO {

    @JsonProperty("candidate_id")
    private int id;

    @JsonProperty("candidate_name")
    private String candidateName;

    @JsonProperty("candidate_votes")
    private String votes;
}
