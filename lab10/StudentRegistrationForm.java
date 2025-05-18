import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {
    JTextField nameField, addressField, emailField;
    JPasswordField passwordField;
    JRadioButton male, female;
    JCheckBox hobbyReading, hobbyGaming;
    JComboBox<String> countryBox;
    JTextArea opinionArea;
    JButton submitButton;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel formPanel = new JPanel(new GridLayout(9, 1, 5, 5));

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        namePanel.add(nameField);
        formPanel.add(namePanel);

        JPanel addressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        addressPanel.add(new JLabel("Address:"));
        addressField = new JTextField(20);
        addressPanel.add(addressField);
        formPanel.add(addressPanel);

        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emailPanel.add(new JLabel("Email:"));
        emailField = new JTextField(20);
        emailPanel.add(emailField);
        formPanel.add(emailPanel);

        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(20);
        passPanel.add(passwordField);
        formPanel.add(passPanel);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male); genderGroup.add(female);
        genderPanel.add(male); genderPanel.add(female);
        formPanel.add(genderPanel);

        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hobbyPanel.add(new JLabel("Hobbies:"));
        hobbyReading = new JCheckBox("Reading");
        hobbyGaming = new JCheckBox("Gaming");
        hobbyPanel.add(hobbyReading); hobbyPanel.add(hobbyGaming);
        formPanel.add(hobbyPanel);

        JPanel countryPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        countryPanel.add(new JLabel("Country:"));
        String[] countries = {"India", "Nepal", "USA"};
        countryBox = new JComboBox<>(countries);
        countryPanel.add(countryBox);
        formPanel.add(countryPanel);

        JPanel opinionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        opinionPanel.add(new JLabel("Opinion:"));
        opinionArea = new JTextArea(4, 20);
        opinionPanel.add(new JScrollPane(opinionArea));
        formPanel.add(opinionPanel);

        JPanel buttonPanel = new JPanel();
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        buttonPanel.add(submitButton);
        formPanel.add(buttonPanel);

        add(formPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String address = addressField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        String gender = "";
        if (male.isSelected()) gender = "Male";
        else if (female.isSelected()) gender = "Female";

        StringBuilder hobbies = new StringBuilder();
        if (hobbyReading.isSelected()) hobbies.append("Reading ");
        if (hobbyGaming.isSelected()) hobbies.append("Gaming ");

        String country = (String) countryBox.getSelectedItem();
        String opinion = opinionArea.getText();

        String info =
            "Student Information:\n" +
            "--------------------------\n" +
            "Name: " + name + "\n" +
            "Address: " + address + "\n" +
            "Email: " + email + "\n" +
            "Password: " + password + "\n" +
            "Gender: " + gender + "\n" +
            "Hobbies: " + hobbies + "\n" +
            "Country: " + country + "\n" +
            "Opinion: " + opinion;

        JOptionPane.showMessageDialog(this, info, "Submitted Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
