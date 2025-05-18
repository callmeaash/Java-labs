import javax.swing.*;

public class InternalFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JDesktopPane Example");
        JDesktopPane desktopPane = new JDesktopPane();

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setVisible(true);

        desktopPane.add(internalFrame);
        frame.add(desktopPane);

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}