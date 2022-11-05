package leetcode.programming.skills1;

public class ToBinary {
    public String toBinaryString(int val) {
        return Integer.toBinaryString(val);
    }

    public String toBinaryStringPetMethod(int val) {
        StringBuilder stringBuilder = new StringBuilder();
        if (val == 0){
            stringBuilder.append(0);
        } else {
            while (val > 0) {
                stringBuilder.append(val % 2);
                val /= 2;
            }
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        ToBinary toBinary = new ToBinary();
        System.out.println(toBinary.toBinaryStringPetMethod(137));
        System.out.println(toBinary.toBinaryString(137));
    }
}
