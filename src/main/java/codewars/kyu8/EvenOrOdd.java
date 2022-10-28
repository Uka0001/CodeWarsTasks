package codewars.kyu8;

/*Create a function that takes an integer
as an argument and returns "Even" for even
numbers or "Odd" for odd numbers.*/

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String result;
        if  (number %2 != 0){
            result = "Odd";
        } else {
            result = "Even";
        }
        return result;
    }

    /*public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
    }*/
}
