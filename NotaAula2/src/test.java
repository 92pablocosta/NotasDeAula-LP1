public class test {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = 15;

        a = b;

        if (a > b) {
            System.out.println("M");
        } else {
            System.out.println(++a + b++);
        }
    }

}
