import javax.swing.*;

public class Javanotes43 {
    static int rollDice(int goal,   int rolls){

        int oldThrow;
        int newThrow = 0;

        while(true) {
            oldThrow = newThrow;
            newThrow = (int) Math.random() * 6;
            if (oldThrow == newThrow) {
                return rolls;
            } else {
                rolls++;
            }
        }
    }
    public static void main(String[] args) {
        int goal;
        int rolls = 0;

        while(true) {
            goal = Integer.parseInt(JOptionPane.showInputDialog("Please specify a number between 1 and 13"));
            if (goal < 13 && goal > 1) {
                break;
            }
            rollDice(goal, 0);
        }
        System.out.println(rolls);
    }
}
