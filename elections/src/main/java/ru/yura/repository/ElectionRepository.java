package ru.yura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yura.repository.dto.ElectionDTO;

@Repository
public interface ElectionRepository extends JpaRepository<ElectionDTO, Integer> {
}
