package com.company;
import java.util.*;

//CHECK PERMUTATION: GIVEN TWO STRINGS, WRITE A METHOD TO DECIDE IF ONE IS A PERMUTATION OF THE OTHER.
public class Main {

    public static void main(String[] args) {
	    String s = "degree";
	    String t = "greede";
        boolean per = permutation(s,t);
        System.out.println(per);
    }
    public static String sort(String s){
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
