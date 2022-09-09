package codewars.kyu8;

public class ReverseWords {
    public static String reverseWords(String str) {
        String[] newStr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = newStr.length - 1; i >= 0; i--) {
            stringBuilder.append(newStr[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();

        //BestPractice
        //     List Words = Arrays.asList(str.split(" "));
        //     Collections.reverse(Words);
        //     return String.join(" ", Words);
    }
}
