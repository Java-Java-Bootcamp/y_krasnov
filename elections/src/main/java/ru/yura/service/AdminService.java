package ru.yura.service;


import org.springframework.stereotype.Service;
import ru.yura.repository.ElectionRepository;
import ru.yura.repository.dto.ElectionDTO;

import java.util.LinkedList;
import java.util.List;

@Service
public class AdminService {

    private final ElectionRepository electionRepository;

    public AdminService(ElectionRepository electionRepository) {
        this.electionRepository = electionRepository;
    }


    public void createElection() {

    }

    public void startElection() {

    }

    public void endElection() {

    }

    public List<ElectionDTO> getElections() {
        List<ElectionDTO> election = electionRepository.findAll();
        return election;
    }
}
