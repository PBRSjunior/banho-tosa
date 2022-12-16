package br.com.amordepet.banhotosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class BanhoTosaApplication {

	@GetMapping
	public String gethomeTeste() {
		return "Banho tosa - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(BanhoTosaApplication.class, args);
	}

}
