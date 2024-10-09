package pl.com.words;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.com.words.domain.AppUser;
import pl.com.words.domain.AppUserRepository;
import pl.com.words.domain.Word;
import pl.com.words.domain.WordRepository;

import java.util.List;

@SpringBootApplication
public class WordsApplication implements CommandLineRunner {
	private final AppUserRepository urepository;
	private final WordRepository wrepository;

	public static void main(String[] args) {
		SpringApplication.run(WordsApplication.class, args);
	}

	public WordsApplication(AppUserRepository urepository, WordRepository wrepository) {
		this.urepository = urepository;
		this.wrepository = wrepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// Username: user, password: user
		urepository.save(new AppUser("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"));
		// Username: admin, password: admin
		urepository.save(new AppUser("admin","$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));

		wrepository.save(new Word("is", List.of("jest")));
        wrepository.save(new Word("car", List.of("samochód")));

	}

	//    @PostConstruct
//    void initSomeWords() {
//        repository.save(new Word("is", List.of("jest")));
//        repository.save(new Word("car", List.of("samochód")));
//
//    }

}
