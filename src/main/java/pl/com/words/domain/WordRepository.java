package pl.com.words.domain;

import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<Word, Long> {
}
