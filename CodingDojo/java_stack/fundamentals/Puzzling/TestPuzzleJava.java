import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // 1st
        ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
        // // 2nd
        Character randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);
        // 3rd
        String randomPass = generator.generatePassword();
        System.out.println(randomPass);
        // 4th
        ArrayList<String> randomPassSet = generator.getNewPasswordSet(9);
        System.out.println(randomPassSet);
    }
}