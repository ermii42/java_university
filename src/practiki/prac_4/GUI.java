package practiki.prac_4;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;

class GUI extends JFrame{



    JPanel[] pnl = new JPanel[4];
    private int a=0, b=0;
    private String team = "N/A";
    private String  win = "";

    JLabel score = new JLabel(a+"_X_"+b);
    JLabel last = new JLabel("Last Scorer: " + team);
    Label winner = new Label("Winner: " + win);
    Font fnt = new Font("Times new roman", Font.BOLD, 40);

    public GUI(){
        super("Football");
        setLayout(new GridLayout(2, 2));
        for(int i=0;i<pnl.length;i++){
            pnl[i] = new JPanel();
            if(i%2==0) pnl[i].setBackground(new Color(176, 224, 230));
            else pnl[i].setBackground(new Color(255, 240, 245));
            add(pnl[i]);
        }

        JButton button_Real = new JButton("AC Milan");
        JButton button_Milan = new JButton("Real Madrid");


        pnl[0].add(button_Real);
        pnl[1].add(button_Milan);

        pnl[2].setLayout(new FlowLayout());
        pnl[2].add(last);
        pnl[2].add(winner);

        score.setFont(fnt);
        pnl[3].add(score);

        button_Real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a+=1;
                if(a==b) win = "";
                else if(a>b) win = "Real Madrid";
                else win = "AC Milan";
                team = "Real Madrid";
                winner.setText("Winner: " + win);
                last.setText("Last Scorer: " + team);
                score.setText(a+"_X_"+b);
            }
        });

        button_Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b+=1;
                if(a==b) win = "";
                else if(a>b) win = "Real Madrid";
                else win = "AC Milan";
                team = "AC Milan";
                winner.setText("Winner " + win);
                last.setText("Last Scorer: " + team);
                score.setText(a+"_X_"+b);
            }
        });
        setSize(550, 250);
    }
}
