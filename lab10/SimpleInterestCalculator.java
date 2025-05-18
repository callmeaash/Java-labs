import javax.swing.JOptionPane;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        String principalStr = JOptionPane.showInputDialog(null,"Enter Principal Amount:", "Simple Interest Calculator", JOptionPane.QUESTION_MESSAGE);
        String rateStr = JOptionPane.showInputDialog(null, "Enter Rate of Interest (in %):", "Simple Interest Calculator", JOptionPane.QUESTION_MESSAGE);
        String timeStr = JOptionPane.showInputDialog(null, "Enter Time (in years):", "Simple Interest Calculator", JOptionPane.QUESTION_MESSAGE);
        double principal = Double.parseDouble(principalStr);
        double rate = Double.parseDouble(rateStr);
        double time = Double.parseDouble(timeStr);
        double simpleInterest = (principal * rate * time) / 100;
        JOptionPane.showMessageDialog(null,
                String.format("Simple Interest = %.2f", simpleInterest),
                "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
