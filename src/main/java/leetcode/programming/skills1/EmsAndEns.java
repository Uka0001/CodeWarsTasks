package leetcode.programming.skills1;
/*
* The method that takes a string and checks whether it has the same number m and n.

The method must return true if the number m equals the number n, and false otherwise.

Notes:

the string can contain any character;
The method must be insensitive to the case ('m' and 'M' are considered the same);
if the input string is null, return false;
if the input string is empty, return true.
Examples:
isEqually("mmmnnn") => true;
isEqually("Mmnn") => true;
isEqually("MMsdfmNNsdn") => true;
isEqually("MMmNn") => false;
isEqually("sdff") => true; // за відсутності 'm' і 'n' має повертатися true
*/
public class EmsAndEns {
    public static boolean isEqually(String str) {
        if (str == null) {
            return false;
        } else if (str.length() == 0) {
            return true;
        } else {
            int countN = 0;
            int countM = 0;
            char[] charArr = str.toUpperCase().toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == 'N') {
                    countN++;
                }
                if (charArr[i] == 'M') {
                    countM++;
                }
            }
            return countN == countM;
        }
    }
}
