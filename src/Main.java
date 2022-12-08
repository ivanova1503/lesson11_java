import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        String str1 = String.valueOf(x);
        int y = scanner.nextInt();

        System.out.println(Math.max(Integer.parseInt(str1),y));
        
        double min = Math.min(Integer.parseInt(str1),y);
        System.out.println(min);
    }
}