// package edu.princeton.cs.algs4;

import java.util.Scanner;

class AddLargeNumbers {
    
    public static LinkedStack numberToDigits(String number) {
        LinkedStack l = new LinkedStack();
        String[] tokens = number.split("");
        for (int i = 0; i < tokens.length; i++) {
            l.push(Integer.parseInt(tokens[i]));
        }

        return l;

    }

    public static String digitsToNumber(LinkedStack list) {
        return list.toString();
    }

    public static LinkedStack addLargeNumbers(LinkedStack list1, LinkedStack list2) {
        return list1;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedStack pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedStack qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedStack result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
