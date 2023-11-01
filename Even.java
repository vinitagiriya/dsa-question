import java.util.Scanner;
public class Even {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n, number;
    do{
        System.out.println("enter an number between o and 1");
        n=sc.nextInt();
        if(n==1){
            System.out.println("enter the marks");
            number=sc.nextInt();
            if(number>=90){
                System.out.println("This is good");
            }
            else if(number>=89||number>=69){
                System.out.println("this is also good");
            }
            else if(number>=59||number>=0){
                System.out.println("work hard");
            }
        }
    }while(n!=1);
        
          
 }
}
