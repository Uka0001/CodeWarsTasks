package codewars.kyu7;

/*Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.*/

public class Vowels {

    public static int getCount(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char each : chars) {
            if (each == 'a' | each == 'e' | each == 'i' | each == 'o' | each == 'u') {
                count += 1;
            }
        }
        return count;

        //Best practices from CodeWars
        //1
        /*return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();*/
        //2
        /* return str.replaceAll("(?i)[^aeiou]", "").length();*/
    }

}
