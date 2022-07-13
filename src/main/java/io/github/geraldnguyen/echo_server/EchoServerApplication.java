package io.github.geraldnguyen.echo_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("nguyen.gerald.echo")
public class EchoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoServerApplication.class, args);
	}

}
