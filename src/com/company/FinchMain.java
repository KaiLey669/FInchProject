package com.company;

import com.company.window.FinchWindow;

import javax.swing.*;


public class FinchMain {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FinchWindow();
            }
        });
    }
}
