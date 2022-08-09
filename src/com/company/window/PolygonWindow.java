package com.company.window;

import com.company.finch.FinchDrawer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PolygonWindow extends JDialog{

    private JPanel rootPanel;
    private JButton DrawButton;
    private JRadioButton triangleRadioButton;
    private JRadioButton squareRadioButton;
    private JRadioButton pentagonRadioButton;
    private JLabel titleLabel;

    public PolygonWindow(FinchWindow finchWindow, FinchDrawer bird){
        super(finchWindow);
        this.setContentPane(rootPanel);
        this.setSize(300, 150);
        this.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(triangleRadioButton);
        group.add(squareRadioButton);
        group.add(pentagonRadioButton);

        DrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(triangleRadioButton.isSelected())
                    bird.drawPolygon(3);
                if(squareRadioButton.isSelected())
                    bird.drawPolygon(4);
                if(pentagonRadioButton.isSelected())
                    bird.drawPolygon(5);

                PolygonWindow.this.setVisible(false);
                PolygonWindow.this.dispose();
            }
        });
    }
}
