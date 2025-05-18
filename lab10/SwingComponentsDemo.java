import javax.swing.*;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));
        fileMenu.add(newItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        String[][] data = {
            {"1", "Alice", "24"},
            {"2", "Bob", "27"},
        };
        String[] columns = {"ID", "Name", "Age"};

        JTable table = new JTable(data, columns);
        JScrollPane tableScrollPane = new JScrollPane(table);

        JDesktopPane desktopPane = new JDesktopPane();
        JInternalFrame internalFrame = new JInternalFrame("Student Table", true, true, true, true);
        internalFrame.setSize(300, 100);
        internalFrame.setLocation(50, 50);
        internalFrame.add(tableScrollPane);
        internalFrame.setVisible(true);

        desktopPane.add(internalFrame);
        frame.add(desktopPane);

        frame.setVisible(true);
    }
}