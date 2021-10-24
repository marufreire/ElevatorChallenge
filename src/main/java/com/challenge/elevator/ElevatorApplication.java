package com.challenge.elevator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.challenge.elevator.entities.Elevator;
import com.challenge.elevator.threads.FreightElevatorThread;
import com.challenge.elevator.threads.PublicElevatorThread;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.challenge.elevator.repositories")
public class ElevatorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElevatorApplication.class, args);
		new SpringApplicationBuilder(ElevatorApplication.class).web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
				.run(args);

	}

	@SuppressWarnings("static-access")
	@Override
	public void run(String... args) throws Exception {

		System.out.println("ELEVATOR CHALLENGE");
		Elevator e = new Elevator();
		PublicElevatorThread thread1 = new PublicElevatorThread();
		FreightElevatorThread thread2 = new FreightElevatorThread();
		thread1.start();

		thread1.sleep(5000);

		thread2.start();

		thread2.sleep(5000);
	}

}
