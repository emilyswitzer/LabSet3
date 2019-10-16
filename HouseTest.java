import javax.swing.*;

public class HouseTest {
    public static void main(String[] args) {
        House h1 = new House ("44 NewBrook Lawn", "Bungalow", 60000000,"Mary");


        JTextArea jta = new JTextArea(h1.toString());

        JOptionPane.showMessageDialog(null, jta);
    }
}
