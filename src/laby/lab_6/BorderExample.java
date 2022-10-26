package laby.lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class BorderExample extends JFrame
{
    JPanel pnl = new JPanel();

    public BorderExample() {

        add(pnl);
        pnl.setLayout(new BorderLayout());
        JButton btnWest = new JButton("WEST");
        JButton btnEast = new JButton("EAST");
        JButton btnSouth = new JButton("SOUTH");
        JButton btnNorth = new JButton("NORTH");
        JButton btnCenter = new JButton("CENTER");
        pnl.add(btnWest, BorderLayout.WEST);
        pnl.add(btnEast, BorderLayout.EAST);
        pnl.add(btnSouth, BorderLayout.SOUTH);
        pnl.add(btnNorth, BorderLayout.NORTH);
        pnl.add(btnCenter, BorderLayout.CENTER);

        btnWest.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnCenter.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnSouth.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Абха");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnNorth.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnEast.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setSize(400, 400);
    }
}