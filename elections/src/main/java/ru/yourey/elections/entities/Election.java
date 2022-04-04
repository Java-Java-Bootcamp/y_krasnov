package ru.yourey.elections.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "elections")
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Basic
    @Column(name = "election_name")
    private String electionName;

    @OneToMany(
            mappedBy = "election",
            cascade = CascadeType.ALL
    )
    @Fetch(FetchMode.JOIN)
    private List<Candidate> candidates;

}
