import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
        System.out.println("please enter your number");
     int number= scan.nextInt();
     if (number>0){
         System.out.println("number is positive");
     } else if (number<0) {
         System.out.println("number is negative");
     }else {
         System.out.println("number is zero");
     }

        double number1= scan.nextInt();
        double number2= scan.nextInt();
        double number3= scan.nextInt();
        if (number1>number2&&number1>number3){
            System.out.println("the first number is the greatest");
        } else if (number2>number1&&number2>number3) {
            System.out.println("the second number is the greatest");
        }else if(number3>number1&&number3>number2){
            System.out.println("the third number is the greatest");
        }else {
            System.out.println("numbers are equal");
        }
    double sum=number1+number2+number3;
        System.out.println("the sum of the 3 numbers is: "+sum);
        double avg=sum/3;
        System.out.println("the average of the 3 numbers is: "+avg);

        double num1= scan.nextDouble();
        double num2= scan.nextDouble();
        String operation= scan.next();
        switch (operation){
            case "+":
                double sum1=num1+num2;
                System.out.println("the sum is: "+sum1);
                break;
            case "-":
                double sub=num1-num2;
                System.out.println("the sub is: "+sub);
                break;
            case "*":
                double mult=num1*num2;
                System.out.println("the mult is: "+mult);
                break;
            case "/":
                double div=num1/num2;
                System.out.println("the div is: "+div);
                break;
            default:
                System.out.println("invalid");
        }
        System.out.println("please enter your song lyrics");
        String song=scan.nextLine();


        System.out.println("please enter your pattern");
        String pattern= scan.nextLine();
        if (song.contains(pattern)){
            System.out.println("contains");
        }else {
            System.out.println("does not contain");
        }


        }
    }


