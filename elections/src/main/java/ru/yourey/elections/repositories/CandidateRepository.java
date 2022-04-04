package ru.yourey.elections.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yourey.elections.entities.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
