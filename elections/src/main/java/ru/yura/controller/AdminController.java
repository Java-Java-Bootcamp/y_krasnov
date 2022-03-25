package ru.yura.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.yura.repository.dto.ElectionDTO;
import ru.yura.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/elections")
    public List<ElectionDTO> getElections() {
        return adminService.getElections();
    }

}
