package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class Strings {

	public String reverse(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		return stringBuilder.reverse().toString();
	}

	public void countOccurence(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public boolean areStringsAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		for (int i = 0; i < s1.length(); i++) {
			if (!s2.contains(s2.substring(i, i + 1))) {
				return false;
			}
		}
		return true;
	}
}
