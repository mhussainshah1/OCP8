package ocp.ch03;

public class SearchAndSort {

    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);

        StringBuilder alpha1 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            alpha1.append(current);
        }
        System.out.println(alpha1);
    }
}
