import java.util.*;

public class removeVowels {
	
	public String removedVowels(String S) {
	        
	        // charAt(i) implementation
	        StringBuffer strBuild = new StringBuffer();
	               
	        // take out any 'a', 'e', 'i', 'o', 'u'
	        for (int i=0; i<S.length() ; i++)
	        {
	            char ch = S.charAt(i);
	            if (ch != 'a'&& ch != 'e'&& ch != 'i'&& ch != 'o'&& ch != 'u')
	            {
	                strBuild.append(ch);
	            }
	        }
	        
	        // chArray implementation
	        char[] chArray = S.toCharArray();
	        Set<Character> set = new HashSet<>();
	        StringBuffer secondStrBuilder = new StringBuffer();
	
	        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
	        
	        for (int i=0; i< chArray.length; i++)
	        {
	        	if (set.contains(chArray[i]) == false)
	        	{
	        		secondStrBuilder.append(chArray[i]);
	        	}
	        }
	           
	        return secondStrBuilder.toString();
	    }
}

