package com.cunbm.invest.repository;


import com.cunbm.invest.model.Company;
import com.cunbm.invest.model.Proposal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProposalRepository
        extends CrudRepository<Proposal, Long> {

    Proposal findById(int id);
    List<Proposal> findAll();
    void deleteById(int id);
}