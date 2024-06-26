package com.Acc.prv;

import java.util.HashMap;
import java.util.Map;

public class MaxFreqVowel {
	static char maxfreq(String input ) {
		 Map<Character, Integer> vowelCount = new HashMap<>();
	        vowelCount.put('a', 0);
	        vowelCount.put('e', 0);
	        vowelCount.put('i', 0);
	        vowelCount.put('o', 0);
	        vowelCount.put('u', 0);
            //vowel=key, 0=value                 
	        // Convert the string to lower case to make the check case-insensitive
	        input = input.toLowerCase();

	        // Count the vowels in the string
	        for (char c : input.toCharArray()) {
	            if (vowelCount.containsKey(c)) {
	                vowelCount.put(c, vowelCount.get(c) + 1);
	            }
	        }

	        // Find the vowel with the highest count
	        char mostFrequentVowel = ' ';
	        int maxCount = 0;     
	        // Using entrySet() to get the set view 
	        //Interface Map.Entry<K,V>
	        //K: It is the type of keys maintained by this map.
	       // V: It is the type of mapped values.
	        //These Map.Entry objects are valid only for the duration of the iteration
	        for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                mostFrequentVowel = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	        return mostFrequentVowel;
	    }
	

	public static void main(String[] args) {
		String s="annpan";
		System.out.println(maxfreq(s));

	}

}
