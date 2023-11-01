import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        double add=a+b;
        double sub=a-b;
        double multi=a*b;
        double divide=a/b;
        double reminder=a%b;
        switch(operator){
            case '+':
            System.out.println(add);
            break;
        case '-':
        System.out.println(sub);
        break;
        case '*':System.out.println(multi);
        break;
        case '/': System.out.println(divide);
        break;
        case '%':System.out.println(reminder);
        break;
        default:System.out.println("invalid character");
    }
    }
    
}
