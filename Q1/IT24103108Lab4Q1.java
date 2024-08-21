import java.util.Scanner;
public class  IT24103108Lab4Q1{
    public static void main(String[] args){
         Scanner m=new Scanner(System.in);
         System.out.print("Ent your num:- ");
         int n=m.nextInt();
         if(n>0){
              System.out.println("number is:-" +' '+"Positive");
         }
         else if(n<0){
              System.out.println("number is:-" +' '+"Negative");
         }
         else{
              System.out.println("number is:-" +' '+"Zero");
         }
     }
}