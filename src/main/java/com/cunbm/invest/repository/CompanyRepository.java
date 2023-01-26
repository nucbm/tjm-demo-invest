package com.cunbm.invest.repository;


import com.cunbm.invest.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository
        extends CrudRepository<Company,
                Integer> {

    Company findById(int id);
    List<Company> findAll();
    void deleteById(int id);
}