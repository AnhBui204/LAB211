package Models;

import java.util.HashMap;
import java.util.StringTokenizer;

public class CharacterCount {
    private HashMap<Character, Integer> charCount;
    private HashMap<String, Integer> wordCount;
    public CharacterCount() {
        charCount = new HashMap<>();
        wordCount = new HashMap<>();
    }
    
    public void countCh(String input){
        charCount.clear();
        wordCount.clear();
        
        StringTokenizer tokenizer = new StringTokenizer(input);
        
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            
            wordCount.put(token, wordCount.getOrDefault(token, 0) + 1);
            for(int i = 0; i < token.length(); i++){
                char ch = token.charAt(i);
                
                if(Character.isLetter(ch)){
                    ch = Character.toLowerCase(ch);
                    charCount.put(ch, charCount.getOrDefault(ch,0) + 1);
                }
            }
        }
    }
    
    public HashMap<Character, Integer> getCharCount(){
        return charCount;
    }
    public HashMap<String, Integer> getWordCount(){
        return wordCount;  
    }
}
