
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class LongestCommonPrefix{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("a", "b", "c"));
        words.sort(Comparator.comparing(String::length));
        String smallest = words.get(0);
        String largest = words.get(words.size()-1);
        StringBuilder s = new StringBuilder(); // or String s = "";
        for(int i = 0; i < smallest.length(); i++){
            if(smallest.charAt(i) != largest.charAt(i)){
                break;
            }else{
                s.append(smallest.charAt(i)); // or s += smallest.charAt(i)
            }
        }
        System.out.println(s);
        
        // Below will check for the whole word, not by character by character
        
//        boolean foundCommon = false;
//        for(String word : words){
//            if(!smallest.contains(word.substring(0,smallest.length()))){
//                foundCommon = true;
//            }
//        }
//        if (foundCommon){
//            System.out.println(".");
//        } else{
//            System.out.println(smallest);
//        }
    }
}