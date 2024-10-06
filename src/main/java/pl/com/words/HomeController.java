package pl.com.words;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.com.words.domain.Word;

@Controller
public class HomeController {
    private final WordService wordService;

    public HomeController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/words")
    public Iterable<Word> getWords() {
        return this.wordService.getWords();
    }


}
