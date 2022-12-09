import java.util.Scanner;

class lab2_task2 {
    public static boolean isStrong(String userPass) {
        return userPass.matches("^(?=.*[A-Z].*)(?=.*[0-9].*)(?=.*[a-z].*).{8,}$");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваш пароль: ");
        String userPass = scan.next();

        if (isStrong(userPass)) {
            System.out.println("Пароль надежен");
        } else {
            System.out.println("Пароль ненадежен. Повторите ввод");
        }
    }
}