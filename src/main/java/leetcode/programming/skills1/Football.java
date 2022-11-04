package leetcode.programming.skills1;

public class Football {
    public static void main(String[] args) {

    }

    public int matchResult(int res1, int res2, int bt1, int bt2) {

        return (res1 == bt1 && res2 == bt2) ? 2 : ((bt1 > bt2 && res1 > res2) ? 1 : ((bt1 < bt2 && res1 < res2) ? 1 : ((bt1 == bt2 && res1 == res2) ? 1 : 0)));
    }
}
