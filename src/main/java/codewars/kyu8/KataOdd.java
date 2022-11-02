package codewars.kyu8;

/*
* Given a number n, return the number of positive odd numbers below n, EASY!

Examples (Input -> Output)

7  -> 3 (because odd numbers below 7 are [1, 3, 5])
15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
Expect large Inputs!
* */
public class KataOdd {
    /*public static int oddCount(int n){
        int count = 0;
        for (int i = 0; i < n; i++){
            if (i%2 == 1){
                count++;
            }
        }
        return count;
    }*/
    /*public static int oddCount(int n){
        int count = 0;
        while (n > 0){
            if (n%2 == 1){
                count++;
            }
            n--;
        }
        return count;
    }*/
    public static int oddCount(int n) {
        int count = 0;
        if (n % 2 == 1) {
            count = (n - 1) / 2;
        } else {
            count = n / 2;
        }

        return count;
    }

    //BP
    /*1
    * public static int oddCount(int n){

    return n/2;
  }*/
    /**/
}
