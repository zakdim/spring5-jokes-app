package guru.springframework.joke;

import guru.springframework.joke.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);

		System.out.println("------ Joke");
		JokeService jokeService = ctx.getBean(JokeService.class);
		System.out.println(jokeService.getJoke());
	}
}
