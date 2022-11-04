package io.github.geraldnguyen.echo_server;

import nguyen.gerald.echo.EnableEchoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEchoController
public class EchoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoServerApplication.class, args);
	}

}
