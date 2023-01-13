package org.example;

import java.util.*;

public class WordChain {
    public List<String> getShortestChain(String start, String end, Set<String> dictionary) {

        Set<String> visited = new HashSet<>();
        Queue<List<String>> queue = new LinkedList<>();
        List<String> wordChain = new ArrayList<>();

        wordChain.add(start);
        queue.add(wordChain);
        visited.add(start);

        while (!queue.isEmpty()) {
            List<String> currentChain = queue.poll();
            String lastWord = currentChain.get(currentChain.size() - 1);

            if (lastWord.equals(end)) {
                return currentChain;
            }

            for (int i = 0; i < lastWord.length(); i++) {
                char[] wordChars = lastWord.toCharArray();

                for (char j = 'a'; j <= 'z'; j++) {
                    wordChars[i] = j;
                    String newWord = new String(wordChars);
                    if (dictionary.contains(newWord) && !visited.contains(newWord)) {
                        List<String> newChain = new ArrayList<>(currentChain);
                        newChain.add(newWord);
                        queue.add(newChain);
                        visited.add(newWord);
                    }
                }
            }
        }
        return new ArrayList<>();
    }
}
