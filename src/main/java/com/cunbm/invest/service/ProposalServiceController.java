package com.cunbm.invest.service;

import com.cunbm.invest.repository.ProposalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class ProposalServiceController {

    private ProposalRepository repo;

    public ProposalServiceController(ProposalRepository repo){
        this.repo = repo;
    }


    @RequestMapping(value = "/proposal", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllProposals() {

/*
        System.out.println("\n*** GET /proposal ");
        System.out.println(repo.count());
        return new ResponseEntity<>(Arrays.asList(
                new com.cunbm.invest.model.Proposal(101,"Student Proposal 01"),
                new com.cunbm.invest.model.Proposal(102,"Student Proposal 02"),
                new com.cunbm.invest.model.Proposal(103,"Student Proposal 03")
        ),
                HttpStatus.OK);
    }
*/
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

/*

        // Get the company details by
        // ID
        @GetMapping("/proposal/{id}")
        public Proposal getProposalById(int id) {
            return repo.findById(id);
        }

        @PostMapping("/proposal")
        @ResponseStatus(HttpStatus.CREATED)
        public Proposal addCompany(
                @RequestBody Proposal proposal) {
            System.out.println("\n**** insert into 'investapp.proposal' table");
            return repo.save(proposal);
        }

        @DeleteMapping("/delete/{id}")
        public void deleteStudent(
                @PathVariable(value = "id") int id) {
            repo.deleteById(id);
        }
 */
}
