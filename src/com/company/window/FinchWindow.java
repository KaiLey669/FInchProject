package com.company.window;

import com.company.finch.FinchDrawer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinchWindow extends JFrame{

    private JPanel rootPanel;
    private JButton polygonButton;
    private JButton circleButton;
    private JButton heartButton;
    private JButton houseButton;
    private JButton sunButton;
    private JButton treeButton;

    private FinchDrawer bird;

    public FinchWindow(){
        bird = new FinchDrawer();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(rootPanel);
        this.pack();
        this.setSize(300, 200);
        this.setLocation(200, 100);
        this.setVisible(true);

        polygonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PolygonWindow(FinchWindow.this, bird);
            }
        });

        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bird.drawCircle();
            }
        });

        heartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bird.drawHeart();
            }
        });

        houseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bird.drawHouse();
            }
        });

        sunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bird.drawSun();
            }
        });

        treeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bird.drawTree();
            }
        });
    }
}
