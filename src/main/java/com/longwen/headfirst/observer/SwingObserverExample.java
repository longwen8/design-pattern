package com.longwen.headfirst.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by huangxinping on 19/12/5.
 */
public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {

        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame("窗口");
        JButton button = new JButton("Should I do it");
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());

        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setBounds(200,200,300,200);
        frame.setVisible(true);
        // 关闭窗口时自动关闭
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    }

    class AngleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you migt regret it!");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
