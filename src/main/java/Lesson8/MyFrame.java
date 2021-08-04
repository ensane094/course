package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * DANGER, BIOHAZARD!
 * Осторожно, после прочтения данного кода рекомендуется закапать глаза святой водой
 * Но он всё-таки, кое-как, работает!
 * правда, очень сложно конкретно для меня понимание класса MyListener. Это надо ещё обмозговать...
 */

public class MyFrame extends JFrame {
    private final JFrame myFrame;
    private JTextField field;
    private StringBuilder sb = new StringBuilder();                             //чтобы из текстфилда выцепить число пришлось прям тут создать стрингбилдер
    private String str;                                                         //из стрингбилдера надо выцеплять числа сначала сюда
    private double number;                                                      //а потом преобразовать сюда
    private double secondNumber;                                                //а это вторая цифра которая инициилизируется только после нажатия на равно
    private char symbol;
    Font font = new Font("Arial", Font.BOLD, 36);

    public MyFrame() {
        myFrame = new JFrame();
        mainFrameSetup();
        myFrame.add(upperPlate(), BorderLayout.NORTH);
        myFrame.add(buttonsPlate(), BorderLayout.CENTER);
        myFrame.add(rightButtonsPlate(), BorderLayout.EAST);
        myFrame.setVisible(true);
    }

    private void mainFrameSetup() {
        myFrame.setTitle("Calculator");
        myFrame.setBounds(500, 500, 400, 500);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * создаём строку
     */
    private JPanel upperPlate() {
        JPanel panel = new JPanel();
        field = new JTextField();
        panel.add(field);
        field.setEditable(false);
        panel.setLayout(new GridLayout(1, 1));
        return panel;
    }

    /**
     * создаём кнопки0 с 0 по 9 и чтобы забить пустоту кнопки "С" и "="
     */
    private JPanel buttonsPlate() {
        MyListener listener = new MyListener(field);
        JPanel panel = new JPanel();
        for (int i = 0; i < 10; i++) {
            JButton butt = new JButton(String.valueOf(i));
            butt.setFont(font);
            butt.addActionListener(listener);
            panel.add(butt);
        }
        panel.setLayout(new GridLayout(4, 4));

        JButton btC = new JButton("C");
        btC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        // после нажатия на "С" сносим вообще всё
                str = null;
                secondNumber = 0;
                number = 0.0;
                field.setText("");
                sb.setLength(0);
            }
        });
        btC.setFont(font);
        panel.add(btC);

        JButton btEqals = new JButton("=");                 //чтобы выполнить арифметические операции
        btEqals.addActionListener(new ActionListener() {        //нужно две переменные. Одна записывается после нажатия
            @Override                                           //одного из символов "+ - * /", а вторая после нажатия на
            public void actionPerformed(ActionEvent e) {        //"="
                sb.append(field.getText());
                str = sb.toString();
                secondNumber=Double.parseDouble(str);
                sb.setLength(0);
                str="";
                if (check('+')) {                               //проверяем какую арифметическую операцию выбрал пользователь
                    number += secondNumber;                     //путём проверки символа symbol который записывается когда
                    str += number;                              //нажимают на кнопку "+ - * /"
                    field.setText("");                          //когда определили- выполняем соответствующую операцию
                    field.setText(str);
                } else if (check('-')) {
                    number -= secondNumber;
                    str += number;
                    field.setText(str);
                } else if (check('*')) {
                    number *= secondNumber;
                    str += number;
                    field.setText(str);
                } else if (check('/')) {
                    number /= secondNumber;
                    str += number;
                    field.setText(str);
                }
            }
        });
        btEqals.setFont(font);
        panel.add(btEqals);
        return panel;
    }

    private JPanel rightButtonsPlate() {                          //создаём кнопки арифметических знаков
        JPanel panel = new JPanel();
        JButton btPlus = new JButton("+");
        MyListener listener = new MyListener(field);
        btPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        //так как действия при нажатии каждой кнопки примерно одинаковые
                action();                                       //я создал метод action
                symbol = '+';                                   //в котором записывается значение int number
            }                                                   //и удаляется JTextField, а также обнуляется StringBuilder
        });
        btPlus.setFont(font);
        panel.add(btPlus);

        JButton btMinus = new JButton("-");
        btMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
                symbol = '-';
            }
        });
        btMinus.setFont(font);
        panel.add(btMinus);

        JButton btMultiply = new JButton("*");
        btMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
                symbol = '*';
            }
        });
        btMultiply.setFont(font);
        panel.add(btMultiply);

        JButton btDivide = new JButton("/");
        btDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
                symbol = '/';
            }
        });
        btDivide.setFont(font);
        panel.add(btDivide);


        panel.setLayout(new GridLayout(4, 1));
        return panel;
    }

    private boolean check(char ch) {
        if (symbol == ch) return true;
        return false;
    }

    private void action() {
        sb.append(field.getText());
        str = sb.toString();
        number = Double.parseDouble(str);
        field.setText("");
        sb.setLength(0);
        str=null;
    }
}
