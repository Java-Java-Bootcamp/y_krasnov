package ru.yourey.elections.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yourey.elections.dto.ElectionDTO;
import ru.yourey.elections.mappers.ElectionMapper;
import ru.yourey.elections.repositories.ElectionRepository;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private ElectionMapper electionMapper;

    private ElectionRepository electionRepository;

    @Autowired
    public AdminController(
            ElectionMapper electionMapper,
            ElectionRepository electionRepository
    ) {
        this.electionMapper = electionMapper;
        this.electionRepository = electionRepository;
    }

    @GetMapping("/elections")
    public ResponseEntity<List<ElectionDTO>> getElections() {
        return new ResponseEntity<>(
                electionMapper.electionsListToElectionDTOList(
                        electionRepository.findAll()
                ),
                HttpStatus.OK
        );
    }
}
