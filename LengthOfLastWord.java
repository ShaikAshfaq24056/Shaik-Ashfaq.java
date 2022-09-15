import java.util.*;
public class LengthOfLastWord {  
 public static void main(String[] args) {
        String str1 = "Shaik Ashfaq";
		System.out.println("Original String: "+str1);
        System.out.println("Length of the last word of the above string: "+length_Of_last_word(str1));
    }

    public static int length_Of_last_word(String str1) {
        int length_word = 0;
        String[] words = str1.split(" ");
        if(words.length>0) {
            length_word = words[words.length-1].length();			
        } else {
            length_word = 0;
        }
        return length_word;
    }
}