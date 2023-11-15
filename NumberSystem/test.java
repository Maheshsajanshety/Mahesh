package NumberSystem;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer : ");
        int number=sc.nextInt();
        if((number & 1)==1){
            System.out.println("Given number is Odd ");
        }else{
            System.out.println("Given number is even ");
        }

    }
}
