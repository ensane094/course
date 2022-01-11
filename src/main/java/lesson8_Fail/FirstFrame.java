package lesson8_Fail;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame {
    private final JFrame mainFrame;
    private final JPanel jPanel;
    private JTextField jTextField;

    FirstFrame() {
        this.mainFrame = new JFrame();
        this.jPanel = new JPanel();
        initMainFrame();
        mainFrame.add(createTextFieldArea(), BorderLayout.NORTH);
        mainFrame.add(createButtons(), BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }

    private void initMainFrame() {

        Rectangle rectangle = new Rectangle(400, 400);
        mainFrame.setBounds(rectangle);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private JPanel createTextFieldArea() {
        JPanel panel = new JPanel();
        jTextField = new JTextField();
        panel.setLayout(new GridLayout(1, 1));
        JTextField field = new JTextField();
        field.setEditable(false);
        panel.add(field);
        return panel;
    }

    private JPanel createButtons() {
        ButtonsListener listener = new ButtonsListener(jTextField);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(listener);
            panel.add(btn);
        }
        return panel;
    }

}
