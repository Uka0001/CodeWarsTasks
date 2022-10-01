package leetcode.programming.skills1;
/*
* Repeat String(), which accepts a whole count
*  number and string string and returns a new string,
*  in which string repeats the count number of times.
* repeatString(0, "hi") -> "";
repeatString(3, "hello") -> "hellohellohello";
repeatString(5, "1") -> "11111";
repeatString(4, "hi") -> "hihihihi";
repeatString(1, "hi") ->"hi".*/
public class RepeatString {
    public static String repeatString(int count, String string) {
        StringBuilder stringResult = new StringBuilder();
        for (int i = 0; i < count; i++){
            stringResult.append(string);
        }
        return stringResult.toString();
    }
}
