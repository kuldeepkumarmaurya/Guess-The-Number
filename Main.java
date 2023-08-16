import java.util.Random;
import java.util.Scanner;
class game{
    int com_num;
    int user_num;
    int result ;
    public game(int num1){
        com_num = num1;
    }
    public void user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Your Number : ");
        user_num = sc.nextInt();
    }
    public void gameMode(){

        if(com_num == user_num){
            result = 1;
            System.out.println("------------------------------------------------");
            System.out.println("           CONGRATULATION YOU WON !!!"); 
            System.out.println("------------------------------------------------");
        } else if (com_num > user_num) {
            System.out.println("Your number is Smaller ");
            result = 0;
        }
        else {
            System.out.println("Your number is Bigger ");
            result = 0;
        }
    }
    public int getresult(){
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("GUESS THE NUMBER FROM 0 TO 100 FOR WIN THE GAME ");

        Random random = new Random();
        int computer_num = random.nextInt(101);
        game start = new game(computer_num);
        start.user_input();
        start.gameMode();
        do {
            if (start.getresult() == 0){
                start.user_input();
                start.gameMode();
            } else {
                System.out.println("game over");
            }
        }while (start.getresult() == 0);
    }
}