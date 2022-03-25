package ru.yura.repository.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name = "candidates")
public class CandidateDTO {

    @Id
    private Integer id;

    private String candidate;

    private Integer election_id;

    private Integer votes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public Integer getElection_id() {
        return election_id;
    }

    public void setElection_id(Integer election_id) {
        this.election_id = election_id;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}

