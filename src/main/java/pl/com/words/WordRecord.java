package pl.com.words;

import java.util.List;

public record WordRecord(String headword, List<String> definitions) {
}
