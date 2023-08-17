import java.util.Random;
import java.util.Scanner;

class guess_game{
    int i;
    int c;
    int a;
    int count=0;
    boolean f=false;
    
    public guess_game(){
        Random ran=new Random();
        a=ran.nextInt(51)+50;
        i=a;

    }
    public void userinput(Scanner sc){
        System.out.print("Enter number to guess :");
       
        c=sc.nextInt();
        


    }
    public void iscorrectnumber(){
        
        
        if(i>c){
            System.out.println("Go for more");
            count+=1;
        }
        else if(i<c){
            System.out.println("Go for less");
            count+=1;
        }
        else{
            System.out.println("You Guessed the right number ");
            f=true;
        }

    }
    public void get(){
        System.out.println("Number of attempts taken :"+count);
    }

}
public class NumberGuess {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("The computer has generated number from 50 to 100, Guess if can!!");
        guess_game obj=new guess_game();
         Scanner sc =new Scanner(System.in);
        
        while(obj.f!=true){
            obj.userinput(sc);
            obj.iscorrectnumber();
        }
        obj.get();
        sc.close();

        
    }
}
