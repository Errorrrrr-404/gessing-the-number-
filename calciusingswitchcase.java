import java.util.*;
public class calciusingswitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number ::");
        double a = sc.nextDouble();
        System.out.println("enter a second number ::");
        double b = sc.nextDouble();
        System.out.println("select operater");
        System.out.println("addition-a:: substraction-b :: multiplication-m ::division-d ::");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a' :
            System.out.println("sum of two number is:" +(a+b));
            break;
            case 'b' :
            System.out.println("difference of two numbers is::" +(a-b));
            break ;
            case 'm' :
            System.out.println("multiplication of two number is ::" +(a*b));
            break;
            case 'd':
            System.out.println("division of two numbers is:: " +(a/b));
            break;
            default :
            System.out.println("invalid operator");
        }

    }
    
}
