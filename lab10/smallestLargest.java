import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class smallestLargest extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, num3Field;
    private JButton smallestButton, largestButton;
    private JTextField smallestResult, largestResult;

    public smallestLargest() {
        setTitle("Find Smallest and Largest");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 10));

        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Number 3:"));
        num3Field = new JTextField();
        add(num3Field);

        smallestButton = new JButton("Find Smallest");
        add(smallestButton);
        smallestButton.addActionListener(this);

        smallestResult = new JTextField();
        smallestResult.setEditable(false);
        add(smallestResult);

        largestButton = new JButton("Find Largest");
        add(largestButton);
        largestButton.addActionListener(this);

        largestResult = new JTextField();
        largestResult.setEditable(false);
        add(largestResult);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(num1Field.getText());
        double n2 = Double.parseDouble(num2Field.getText());
        double n3 = Double.parseDouble(num3Field.getText());
        if (e.getSource() == smallestButton) {
            double smallest = Math.min(n1, Math.min(n2, n3));
            smallestResult.setText(String.valueOf(smallest));
        } else if (e.getSource() == largestButton) {
            double largest = Math.max(n1, Math.max(n2, n3));
            largestResult.setText(String.valueOf(largest));
        }
    }

    public static void main(String[] args) {
        new smallestLargest();
    }
}
