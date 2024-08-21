import java.util.Scanner;
public class IT24103108Lab4Q3{
   public static void main(String[] args){
      Scanner m=new Scanner(System.in);
      System.out.print("Ent your num:- ");
      int num=m.nextInt();
      System.out.println("num is:-"+" "+((num>0)? "positive" : (num<0) ? "negative" : "zero"));
  }
}