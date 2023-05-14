package task3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyDictionary {
    private static Map<String, String> dictionary = new HashMap<>();

    public void addWordPair(String s1, String s2){
        dictionary.put(s1, s2);
    }

    public String returnByIndex(int index){
        String wordPair, key = "";
        int count = 0;
        try {
            Set<String> keySet = dictionary.keySet();
            Iterator<String> iterator = keySet.iterator();
            while (count < index) {
                key = iterator.next();
                count++;
            }
            wordPair = dictionary.getOrDefault(key, "I dont know this word");
            return "Word with index " + index + " - " + key + " : " + wordPair;
        }catch (Exception e){
            return e.getMessage();
        }
    }
    public void showAll(){
        dictionary.forEach((String k, String v) -> System.out.println(k + " - " + v));
    }
    public final int dictionarySize(){
        return dictionary.size();
    }
}
