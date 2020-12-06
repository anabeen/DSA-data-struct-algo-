import java.util.*;

public class reverseVowel {

	
    public String reverseVowels(String s) {      
        
        StringBuffer strinBuild = new StringBuffer();
        
        // String to CharArray
        char[] charS = s.toCharArray();
            
        // HashSet vowels to compare
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<charS.length; i++)
        {
        	if (charS[i] == 'a' || charS[i] == 'e' || charS[i] == 'i' || charS[i] == 'o' || charS[i] == 'u' || charS[i] == 'A'
        			|| charS[i] == 'E' || charS[i] == 'I' || charS[i] == 'O' || charS[i] == 'U') {
        		stack.push(charS[i]);
        	}
        }
        
        for (int i=0; i<charS.length; i++)
        {
        	if (charS[i] == 'a' || charS[i] == 'e' || charS[i] == 'i' || charS[i] == 'o' || charS[i] == 'u' || charS[i] == 'A'
        			|| charS[i] == 'E' || charS[i] == 'I' || charS[i] == 'O' || charS[i] == 'U') {
        		charS[i] = stack.peek();
        		stack.pop();
        	}
        	strinBuild.append(charS[i]);
        }
        
        return strinBuild.toString();        
    }
}
