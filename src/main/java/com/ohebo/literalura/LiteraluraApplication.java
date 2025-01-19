package com.ohebo.literalura;

import com.ohebo.literalura.Libreria.Libreria;
import com.ohebo.literalura.repository.iAutorRepository;
import com.ohebo.literalura.repository.iLibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	private iLibroRepository libroRepository;
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();
	}
}
