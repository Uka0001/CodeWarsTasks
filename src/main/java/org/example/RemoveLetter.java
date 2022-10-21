package org.example;

public class RemoveLetter {
    public static void main(String[] args) {
        System.out.println(removeLetter("Ґудзик").toString());
    }

    static char [] removeLetter (String input){
        char [] charArray;
        if (input.isEmpty()){
            charArray = new char[0];
        } else {
            charArray = input.toLowerCase().toCharArray();

        }
        return charArray;
    }
}
