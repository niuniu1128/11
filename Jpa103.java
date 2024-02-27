import java.util.Scanner;
public class Jpa103 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Please input:");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();

        

        System.out.printf("Average: %.2f",(float)(a+b+c)/3);

    }
}
