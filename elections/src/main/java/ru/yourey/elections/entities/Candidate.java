package ru.yourey.elections.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column
    private Integer id;

    @Basic
    @Column(name = "candidate")
    private String candidateName;

    @Basic
    @Column(name = "election_id")
    private Long electionId;

    @Basic
    @Column(name = "votes")
    private Long votes;

    @ManyToOne
    @JoinColumn(
            name="election_id",
            referencedColumnName="id",
            insertable = false,
            updatable = false
    )
    private Election election;

}
