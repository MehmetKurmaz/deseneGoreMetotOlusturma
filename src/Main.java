import java.util.Scanner;

public class Main {
    static void method(){
        int n,number,number2,i,result;
        System.out.print("Sayi Giriniz :");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
         number=n;
         System.out.print("Cikti :"+number+" ");
        for ( i=n; i>0;i-=5){
            number-=5;
            System.out.print(number+" ");
        }

        number2 =number;
        for ( i=number2;i<n;i+=5){
            number2+=5;
            System.out.print(number2+" ");

        }


    }
    public static void main(String[] args) {
     method();
    }
}