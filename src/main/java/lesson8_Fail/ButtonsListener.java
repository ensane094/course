package lesson8_Fail;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener {
    private final JTextField field;
    private StringBuilder sb;

    public ButtonsListener(JTextField field) {
        this.field = field;
        sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        sb.append(field.getText()).append(btn.getText());
        field.setText(sb.toString());
        sb.setLength(0);
    }
}
