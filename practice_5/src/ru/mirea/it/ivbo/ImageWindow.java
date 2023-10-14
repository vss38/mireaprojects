package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageWindow extends JFrame
{
    public ImageWindow(String imagePath)
    {
        setTitle("Image Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try
        {
            Image image = ImageIO.read(new File(imagePath));
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            add(imageLabel, BorderLayout.CENTER);

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        pack();
        setVisible(true);
    }
}
