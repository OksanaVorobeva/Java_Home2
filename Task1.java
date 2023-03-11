public class Task1 {

    public static void main(String[] args) {

        String str = "казак";
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                flag = true;
            }

        }
        System.out.println(flag);
    }
}
