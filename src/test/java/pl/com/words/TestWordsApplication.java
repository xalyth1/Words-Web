package pl.com.words;

import org.springframework.boot.SpringApplication;

public class TestWordsApplication {

	public static void main(String[] args) {
		SpringApplication.from(WordsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
