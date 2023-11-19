import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите первое число");
        int a = scanner.nextInt();
        System.out.println(a+ " первое число");
        System.out.println("ведите второе число");
        int b =scanner.nextInt();
        int c = a * b;
        System.out.println("ответ:"+ c);
    }


    }