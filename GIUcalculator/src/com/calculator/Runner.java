package com.calculator;
import javax.swing.*;
import java.awt.*;


public class Runner{


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculator calc = new Calculator();
                calc.setVisible(true);
            }
        });
    }
}
