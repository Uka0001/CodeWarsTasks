package codewars.kyu7;

/*numbers, and have to return the highest and lowest number.
Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.*/

public class Kata {
    public static String highAndLow(String numbers) {
        int temp = -1;
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        String [] newNumbers = numbers.split(" ");
        for (String each: newNumbers){
            temp = Integer.parseInt(each);
            if (temp >= tempMax){
                tempMax = temp;
            }
            if (temp <= tempMin){
                tempMin = temp;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        String result = stringBuilder.append(tempMax).append(" ").append(tempMin).toString();
        return result;
    }

    //Best Practices
    //1
    /*static String highAndLow(String numbers) {
    var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    return stats.getMax() + " " + stats.getMin();
  }*/
    //2
    /*public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
  }*/
}
