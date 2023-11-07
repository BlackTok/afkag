package com.takemikazuchi.afkag;

import com.takemikazuchi.afkag.heroes.ElevationController;
import com.takemikazuchi.afkag.repositorys.ElevationRepository;
import com.takemikazuchi.afkag.services.ElevationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfkagApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfkagApplication.class, args);
	}

}
