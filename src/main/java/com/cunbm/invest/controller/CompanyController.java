package com.cunbm.invest.controller;

import com.cunbm.invest.model.Company;
import com.cunbm.invest.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    //@Autowired
    private CompanyRepository repo;

    // Get All Notes
    @GetMapping("/company")
    public List<Company> getAllNotes() {
        return repo.findAll();
    }

    // Get the company details by
    // ID
    @GetMapping("/company/{id}")
    public Company getCompanyById(
            @PathVariable(value = "id") int id) {
        return repo.findById(id);
    }

    @PostMapping("/company")
    @ResponseStatus(HttpStatus.CREATED)
    public Company addCompany(
            @RequestBody Company company) {
        return repo.save(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(
            @PathVariable(value = "id") int id) {
        repo.deleteById(id);
    }

}