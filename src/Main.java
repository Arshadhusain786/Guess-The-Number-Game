
import java.util.*;

class Game{
    private int counter = 0;
    private int myNumber;
    private int compNumber;

    public Game(){
        compNumber = (int) (Math.random()*100);
    }
    public void setNumber(int n){
        myNumber = n;
    }
    public int isCorrect(){
        if(myNumber == compNumber){
            return 0;
        }
        else if(myNumber > compNumber){
            return -1;
        }
        else{
            return 1;
        }
    }
    public void setCounter(){
        counter++;
    }
    public void getCounter(){
        System.out.println("The number of guesses were "+ counter);
    }
}

class game2{
    public static void main(String[] args) {
        Game g1 = new Game();
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            int n = sc.nextInt();
            g1.setNumber(n);

            if(g1.isCorrect() == 0){
                g1.setCounter();
                System.out.println("Congratulations!! You have guessed the correct number");
                g1.getCounter();
                break;
            }
            else if(g1.isCorrect() == -1){
                g1.setCounter();
                System.out.println("Enter smaller number!!");
            }
            else if(g1.isCorrect() == 1){
                g1.setCounter();
                System.out.println("Enter larger number!!");
            }
        }
    }
}