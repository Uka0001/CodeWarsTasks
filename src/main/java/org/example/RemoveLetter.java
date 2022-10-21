package org.example;

public class RemoveLetter {
    public static void main(String[] args) {
        System.out.println(removeLetter("Reptile"));
    }

    static char [] removeLetter (String input){
        char [] charArray;
        if (input.isEmpty()){
            charArray = new char[0];
        } else {
            charArray = input.toLowerCase().toCharArray();
            for (int i = 0; i < charArray.length; i++){
                if (charArray[i] == 'r'){
                    charArray[i] = '!';
                }
            }

        }
        return charArray;
    }
}
