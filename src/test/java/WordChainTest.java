import org.example.ReadFromFile;
import org.example.WordChain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordChainTest {

    private final WordChain wordChain = new WordChain();
    private final Set<String> words = ReadFromFile.readFromFileToSet("/Users/HU900849/Desktop/CodeKata/CodeKata-19/src/main/resources/wordlist copy.txt");

    @DisplayName("Test input1 for wordChain generator")
    @Test
    void getShortestChainInputOne() {
        //Arrange
        List<String> expected = List.of("cat", "cot", "cog", "dog");

        //Act
        List<String> actual = wordChain.getShortestChain("cat", "dog", words);

        //Assert
        assertEquals(expected.size(), actual.size());
        assertTrue(words.containsAll(actual));
    }

    @DisplayName("Test input2 for wordChain generator")
    @Test
    void getShortestChainInputTwo() {
        //Arrange
        List<String> expected = List.of("lead", "load", "goad", "gold");

        //Act
        List<String> actual = wordChain.getShortestChain("lead", "gold", words);

        //Assert
        assertEquals(expected.size(), actual.size());
        assertTrue(words.containsAll(actual));
    }

    @DisplayName("Test input3 for wordChain generator")
    @Test
    void getShortestChainInputThree() {
        //Arrange
        List<String> expected = List.of("ruby", "rubs", "robs", "rods", "code");

        //Act
        List<String> actual = wordChain.getShortestChain("ruby", "code", words);

        //Assert
        assertEquals(expected.size(), actual.size());
        assertTrue(words.containsAll(actual));
    }
}
