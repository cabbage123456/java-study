import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数的年龄：");
        int age = scanner.nextInt();
        System.out.println("您的年龄为："+age);
    }
}
