package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    private final JTextField tField;
    private StringBuilder sb;

    public MyListener(JTextField tField) {
        this.tField = tField;
        sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton butt = (JButton) e.getSource();
        sb.append(tField.getText()).append(butt.getText());
        tField.setText(sb.toString());

        sb.setLength(0);
    }
}
