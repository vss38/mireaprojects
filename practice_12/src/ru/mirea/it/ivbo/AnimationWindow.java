package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
public class AnimationWindow extends JFrame
{
    private ImageIcon[] frames;
    private JLabel animationLabel;
    private Timer animationTimer;
    private int currentFrameIndex;

    public AnimationWindow()
    {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frames = new ImageIcon[5];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon( "C:/Users/user/IdeaProjects/mireaprojects/practice_12/src/ru/mirea/it/ivbo/" + i + ".png");
        }

        animationLabel = new JLabel();
        add(animationLabel, BorderLayout.CENTER);

        animationTimer = new Timer(100, e -> {
            currentFrameIndex = (currentFrameIndex + 1) % frames.length;
            animationLabel.setIcon(frames[currentFrameIndex]);
        });
        animationTimer.start();

        setVisible(true);
    }
}