package com.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel pnl;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnClear;
    private JButton btnDecimal;
    private JButton btnEquals;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JLabel display;
    private JButton btnDivide;
    private double value = 0.0;
    private double value2 = 0.0;
    String operator = "";

    public Calculator() {
        add(pnl);
        setTitle("a ReALly GoOd caLcUlaTor");
        setSize(600, 700);
        display.setFont(new Font("Serif", Font.BOLD, 20));
        press0();
        press1();
        press2();
        press3();
        press4();
        press5();
        press6();
        press7();
        press8();
        press9();
        pressClear();
        pressDecimal();
        pressEquals();
        pressPlus();
        pressMinus();
        pressMultipy();
        pressDivide();
    }

    public void pressEquals() {
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator.equals("divide")) {
                    double answer = value / Double.parseDouble(display.getText());
                    display.setText("" + answer);
                }
                else if (operator.equals("multiply")) {
                    double answer = value * Double.parseDouble(display.getText());
                    display.setText("" + answer);
                }
                else if (operator.equals("plus")) {
                    double answer = value + Double.parseDouble(display.getText());
                    display.setText("" + answer);
                }
                else if (operator.equals("minus")) {
                    double answer = value - Double.parseDouble(display.getText());
                    display.setText("" + answer);
                }
            }
        });
    }

    public void pressDivide() {
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(display.getText());
                display.setText("");
                operator = "divide";
            }
        });
    }

    public void pressMinus() {
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(display.getText());
                display.setText("");
                operator = "minus";
            }
        });
    }

    public void pressMultipy() {
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(display.getText());
                display.setText("");
                operator = "multiply";
            }
        });
    }

    public void pressPlus() {
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(display.getText());
                display.setText("");
                operator = "plus";
            }
        });
    }

    // adds 0 to display text
    public void press0() {
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
    }

    // adds 0 to display text
    public void press1() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
    }

    // adds 2 to display text
    public void press2() {
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
    }

    // adds 3 to display text
    public void press3() {
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });
    }

    // adds 4 to display text
    public void press4() {
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });
    }

    // adds 5 to display text
    public void press5() {
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
    }

    // adds 6 to display text
    public void press6() {
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
    }

    // adds 7 to display text
    public void press7() {
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
    }

    // adds 8 to display text
    public void press8() {
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
    }

    // adds 9 to display text
    public void press9() {
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });
    }

    // clears display
    public void pressClear() {
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                value2 = 0.0;
            }
        });
    }

    // adds decimal to display
    public void pressDecimal() {
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ".");
            }
        });
    }
}

