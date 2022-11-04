package leetcode.programming.skills1;

public class Planner {
    public static String createPlan(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strings.length == 1) {
            stringBuilder.append("My strings:\n");
            stringBuilder.append(1).append(".) ").append(strings[0]).append(";");
        } else if (strings.length == 2) {
            stringBuilder.append("My strings:\n");
            stringBuilder.append(1).append(".) ").append(strings[0]).append(";\n");
            stringBuilder.append(2).append(".) ").append(strings[1]).append(";");
        } else if (strings.length > 2) {
            stringBuilder.append("My strings:\n");
            int count = 1;
            for (int i = 0; i < strings.length - 1; i++) {
                stringBuilder.append(count).append(".) ").append(strings[i]).append(";\n");
                count++;
            }
            stringBuilder.append(count).append(".) ").append(strings[strings.length - 1]).append(";");
        } else {
            stringBuilder.append("My strings:");
        }
        return stringBuilder.toString();
    }
}
