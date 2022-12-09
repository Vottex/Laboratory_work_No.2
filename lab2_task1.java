import java.util.Scanner;

public class lab2_task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String userDate = scan.nextLine();
        String strPattern = "((31/(0[13578]|1[02])|30/(0[13-9]|1[0-2])|(0[1-9]|[1-2]\\d)/(0[1-9]|1[0-2]))/(19\\d{2}|[2-9]\\d{3}))";
        String strPatternOtherSeparator = "((31.(0[13578]|1[02])|30.(0[13-9]|1[0-2])|(0[1-9]|[1-2]\\d).(0[1-9]|1[0-2])).(19\\d{2}|[2-9]\\d{3}))";
        if (userDate.matches(strPattern))
            System.out.println("Введенное выражение является датой");
        else if (userDate.matches(strPatternOtherSeparator))
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        else
            System.out.println("Введенное выражение не является датой");
    }
}