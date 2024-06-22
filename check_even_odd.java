import java.util.Scanner;
public class check_even_odd{
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        System.out.print("Enter the number to check:");
        try{
            float num=object.nextFloat();
            if (num>0){                       //nested if else is used here
                if (num%2==0){
                    System.out.println(num+" is even");
                }
                else{
                    System.out.println(num+" is odd");
                }
            }
            else if (num==0){
                System.out.println("it is zero");
            }
            else{
                System.out.println("please enter a positive number(greater than zero)");
            }
        }
        catch (Exception e){
            System.out.println("enter only a number");
        }
    }

}