import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Character character = new Character();
        frame.add(character);

        frame.pack();
        frame.setVisible(true);
    }
}
