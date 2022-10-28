import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();
        for(int i=0 ;i<10; i++){
            int x = randMachine.nextInt(21);
            randomRolls.add(x);
        }
        return randomRolls;
    }

    public Character getRandomLetter() {
        char [] alpha= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Random randMachine = new Random();
            int x = randMachine.nextInt(26);
            return alpha[x];
        }

    public String generatePassword() {
        String pass = "" ;
        for(int i=0 ;i<8; i++){
            pass=pass + getRandomLetter();
        }
        return pass;
    }

    public ArrayList<String> getNewPasswordSet(int num) {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0 ;i<num; i++){
            String pass = "" ;
            for(int y=0 ;y<8; y++){
                pass=pass + getRandomLetter();
            }
            arr.add(pass);
        }
        return arr;
    }

}