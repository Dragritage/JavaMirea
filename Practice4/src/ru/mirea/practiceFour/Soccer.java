package ru.mirea.practiceFour;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Soccer extends JFrame {
    JLabel result = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    JLabel lScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    JButton goalMilanButton = new JButton("AC Milan");
    JButton goalRealButton = new JButton("Real Madrid");

    int scoreCounterACM = 0;
    int scoreCounterRM = 0;

    public void checkWinner() {
        if (scoreCounterACM == scoreCounterRM) winner.setText("Winner: DRAW");
        else if (scoreCounterACM > scoreCounterRM) winner.setText("Winner: AC Milan");
        else winner.setText("Winner: Real Madrid");
    }

    public Soccer() {
        super("Soccer Clicker");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Чтобы при закрытии окна прекращалось выполнение кода
        setSize(350, 200);
        this.setLocationRelativeTo(null); //Чтобы окно появлялось по центру экрана
        setLayout(new BorderLayout());
        add(lScorer, BorderLayout.SOUTH);
        add(goalRealButton, BorderLayout.EAST);
        add(goalMilanButton, BorderLayout.WEST);
        add(winner, BorderLayout.NORTH);
        add(result, BorderLayout.CENTER);

        goalMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++scoreCounterACM;
                result.setText("Result: "+scoreCounterACM+" X "+scoreCounterRM);
                lScorer.setText("Last Scorer: AC Milan");
                checkWinner();
            }
        });
        goalRealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++scoreCounterRM;
                result.setText("Result: "+scoreCounterACM+" X "+scoreCounterRM);
                lScorer.setText("Last Scorer: Real Madrid");
                checkWinner();
            }
        });
    }
    public static void main(String[] args) {
        new Soccer().setVisible(true);
    }
}
