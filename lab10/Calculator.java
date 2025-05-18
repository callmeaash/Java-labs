import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton;

    public Calculator() {
        setTitle("Add and Subtract Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 10));

        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        addButton = new JButton("Add");
        add(addButton);
        addButton.addActionListener(this);

        subtractButton = new JButton("Subtract");
        add(subtractButton);
        subtractButton.addActionListener(this);

        resultField = new JTextField();
        resultField.setEditable(false);
        add(new JLabel("                                    Result:"));
        add(resultField);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        if (e.getSource() == addButton) {
            double result = num1 + num2;
            resultField.setText(String.valueOf(result));
        } else if (e.getSource() == subtractButton) {
            double result = num1 - num2;
            resultField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
