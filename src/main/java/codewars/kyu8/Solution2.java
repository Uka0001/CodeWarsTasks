package codewars.kyu8;

/*Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)

6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
FUNDAMENTALSSTRINGS*/

public class Solution2 {
    public static String repeatStr(final int repeat, final String string) {
        int count =  repeat;
        StringBuilder stringNew = new StringBuilder();
        while(count > 0){
            stringNew.append(string);
            count --;
        }
        return stringNew.toString();
    }
}

//Best practise from CodeWars
//1st with for
/*public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }*/
//2nd with repeat
// with  static String repeatStr(int repeat, String string) {
//    return string.repeat(repeat);
//  }