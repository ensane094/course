package idk;

import javax.swing.*;

public class Frames extends JFrame {
    private final JFrame frame;

    public Frames() {
        this.frame=new JFrame();
        frame.setBounds(500,500,400,300);
        frame.setTitle("Привет");
        frame.setLayout(null);
        JTextField field=new JTextField();
        field.setBounds(20,20,70,30);
        frame.add(field);
        JButton btn=new JButton("idk");
        btn.setBounds(20,80,70,30);
        frame.add(btn);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
