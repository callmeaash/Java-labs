import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleCalculator extends JFrame implements ActionListener{
    private JTextField length, breadth, areaResult, perimeterResult;
    private JButton area, perimeter;

    public RectangleCalculator(){
        setTitle("Rectangle Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 12));

        add(new JLabel("Length"));
        length = new JTextField();
        add(length);
        
        add(new JLabel("Breadth"));
        breadth = new JTextField();
        add(breadth);


        area = new JButton("Area");
        add(area);

        areaResult = new JTextField();
        areaResult.setEditable(false);
        add(areaResult);

        perimeter = new JButton("Perimeter");
        add(perimeter);

        perimeterResult = new JTextField();
        perimeterResult.setEditable(false);
        add(perimeterResult);
        
        area.addActionListener(this);
        perimeter.addActionListener(this);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){
        double l = Double.parseDouble(length.getText());
        double b = Double.parseDouble(breadth.getText());
        if (e.getSource() == area) {
            double a = l * b;
            areaResult.setText(String.valueOf(a));
        } else if (e.getSource() == perimeter){
            double p = 2 * (l + b);
            perimeterResult.setText(String.valueOf(p));
        }
    }
    public static void main(String[] args) {
        new RectangleCalculator();
    }
}
