package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
public class PasswordChecker
{
    public PasswordChecker()
    {
        JFrame frame = new JFrame("Проверка пароля");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel serviceLabel = new JLabel("Service:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(serviceLabel, gbc);

        JTextField serviceField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(serviceField, gbc);

        JLabel userNameLabel = new JLabel("User name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(userNameLabel, gbc);

        JTextField userNameField = new JTextField(20);
        gbc.gridx = 1;
        panel.add(userNameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        frame.add(panel);

        frame.setVisible(true);
    }
}
