package com.cunbm.invest;

import com.cunbm.invest.model.Proposal;
import com.cunbm.invest.repository.ProposalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoInvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoInvestApplication.class, args);
	}


	@Bean
	public CommandLineRunner noteDemo(ProposalRepository proposalRepository) {
		return (args) -> {

			// create new proposal
			//proposalRepository.save(new Proposal(123L, "This is another proposal"));

			// fetch all proposals
			System.out.println("Proposals found with findAll():");
			System.out.println("---------------------------");
			for (Proposal prop : proposalRepository.findAll()) {
				System.out.println(prop.toString());  // prop.getName()
			}
			System.out.println();


			// total proposals in DB
			System.out.println("Total proposals in DB:");
			System.out.println("------------------");
			System.out.println(proposalRepository.count());
			System.out.println();

			// delete all proposals
			//proposalRepository.deleteAll();
		};
	}


}
