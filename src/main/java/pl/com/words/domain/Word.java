package pl.com.words.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String headword;
    private List<String> definitions;

    public Word(String headword, List<String> definitions) {
        this.headword = headword;
        this.definitions = definitions;
    }

    public Long getId() {
        return id;
    }

    public String getHeadword() {
        return headword;
    }

    public List<String> getDefinitions() {
        return definitions;
    }

}