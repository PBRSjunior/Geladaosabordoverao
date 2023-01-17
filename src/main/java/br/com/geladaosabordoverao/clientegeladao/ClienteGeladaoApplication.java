package br.com.geladaosabordoverao.clientegeladao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class ClienteGeladaoApplication {
	@GetMapping
	public String getHomeTeste(){
		return "Teste Geladao";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteGeladaoApplication.class, args);
	}

}

