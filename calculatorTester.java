import java.util.Scanner;

public class calculatorTester{

   static Scanner input=null;
   static calculator c1=new calculator();
   
      public static void main(String args[]){
      
         input =new Scanner(System.in);
      
         c1.menuDisplay();
         
         int choice=input.nextInt();
         System.out.println("please enter 2 number");
         double num1=input.nextDouble();
         double num2=input.nextDouble();
         
         double ans=0;
         
         if(choice==1){
            ans=c1.pluz(num1,num2);
         }else if(choice==2){
            ans=c1.subtract(num1,num2);
         }else if(choice==3){
            ans=c1.multiply(num1,num2);
         }else if(choice==4){
            ans=c1.divide(num1,num2);
         }else if(choice==5){
            System.out.println("the end of the calculator 1");
            System.exit(0);

         }
            System.out.println("The answer is ");
      }

}