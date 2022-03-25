package ru.yura.repository.dto;


import javax.persistence.*;


@Entity(name = "elections")
public class ElectionDTO {

    @Id
    private Integer id;

    private String electionName;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "election_id")
    CandidateDTO candidateDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getElectionName() {
        return electionName;
    }

    public void setElectionName(String electionName) {
        this.electionName = electionName;
    }

    public CandidateDTO getCandidateDTO() {
        return candidateDTO;
    }

    public void setCandidateDTO(CandidateDTO candidateDTO) {
        this.candidateDTO = candidateDTO;
    }
}
