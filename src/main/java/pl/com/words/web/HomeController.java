package pl.com.words.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.words.service.WordService;

@RestController
public class HomeController {
    private final WordService wordService;

    public HomeController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/")
    public String index() {
        return this.wordService.getWords().toString();
    }

    @GetMapping("/words")
    public String getWords() {
        return this.wordService.getWords().toString();
    }


}
