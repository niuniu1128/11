import java.util.Scanner;

public class jpa104 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("輸入第1組的x和y座標:");
        double a=scn.nextDouble();
        double b=scn.nextDouble();
        System.out.print("輸入第2組的x和y座標:");
        double c=scn.nextDouble();
        double d=scn.nextDouble();
        double anser =Math.pow(c-a, 2)+Math.pow(d-b,2);
        double anser1 =Math.sqrt(anser);
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",a,b,c,d,anser1);
    }
}
