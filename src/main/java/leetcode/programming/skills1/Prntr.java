package leetcode.programming.skills1;

import java.util.Arrays;

public class Prntr {

    public String prnt(String m) {
        return m;
    }

    public String prnt(int m) {
        return String.valueOf(m);
    }

    public String prnt(double m) {
        return String.valueOf(m);
    }

    public String prnt(String m, int number) {
        return m + " and " + number;
    }

    public String prnt(String [] messages) {
        return Arrays.toString(messages);
    }
}

