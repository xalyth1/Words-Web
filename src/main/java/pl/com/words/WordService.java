package pl.com.words;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.com.words.domain.WordRepository;

import pl.com.words.domain.Word;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordService {

    private final WordRepository repository;

    public WordService(WordRepository repository) {
        this.repository = repository;
    }

    public Iterable<Word> getWords() {
        return repository.findAll();
    }

//    @PostConstruct
//    void initSomeWords() {
//        repository.save(new Word("is", List.of("jest")));
//        repository.save(new Word("car", List.of("samochód")));
//
//    }

}
