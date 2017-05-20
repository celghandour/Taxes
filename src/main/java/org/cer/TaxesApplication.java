package org.cer;


import org.cer.dao.EntrepriseRepository;
import org.cer.dao.TaxeRepository;
import org.cer.entities.Entreprise;
import org.cer.entities.IR;
import org.cer.entities.TVA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TaxesApplication implements CommandLineRunner {

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	@Autowired
	private TaxeRepository taxeRepository;


	public static void main(String[] args) {

		SpringApplication.run(TaxesApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Entreprise e1 =entrepriseRepository.save(new Entreprise("Pixels","compasivo7@gmail.com","Sarl Pi"));
		Entreprise e2 =entrepriseRepository.save(new Entreprise("Pixels2","compasivo7@gmail.com","Sarl Pi2"));
		taxeRepository.save(new TVA("TVA Habitation", new Date(),900,e1));
		taxeRepository.save(new TVA("TVA voiture", new Date(),400,e1));
		taxeRepository.save(new IR("IR 2016", new Date(),4500,e1));
		taxeRepository.save(new TVA("TVA Habitation", new Date(),800,e2));



	}
}
