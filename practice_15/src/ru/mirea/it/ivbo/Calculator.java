package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Calculator
{
    public Calculator()
    {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel firstNumberLabel = new JLabel("1st Number");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(firstNumberLabel, gbc);

        JTextField firstNumberField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(firstNumberField, gbc);

        JLabel secondNumberLabel = new JLabel("2nd Number");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(secondNumberLabel, gbc);

        JTextField secondNumberField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(secondNumberField, gbc);

        JButton addButton = new JButton("+");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(addButton, gbc);

        JButton subtractButton = new JButton("-");
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(subtractButton, gbc);

        JButton multiplyButton = new JButton("*");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(multiplyButton, gbc);

        JButton divideButton = new JButton("/");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(divideButton, gbc);

        frame.add(panel);

        frame.setVisible(true);

        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                performOperation(firstNumberField, secondNumberField, "+");
            }
        });

        subtractButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                performOperation(firstNumberField, secondNumberField, "-");
            }
        });

        multiplyButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                performOperation(firstNumberField, secondNumberField, "*");
            }
        });

        divideButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                performOperation(firstNumberField, secondNumberField, "/");
            }
        });
    }

    private static void performOperation(JTextField firstField, JTextField secondField, String operation)
    {
        String firstText = firstField.getText();
        String secondText = secondField.getText();

        if (firstText.isEmpty() || secondText.isEmpty()) JOptionPane.showMessageDialog(null, "Введите числа в оба поля");
        else
        {
            try
            {
                BigDecimal firstNumber = BigDecimal.valueOf(Double.parseDouble(firstText));
                BigDecimal secondNumber = BigDecimal.valueOf(Double.parseDouble(secondText));

                BigDecimal result = BigDecimal.ZERO;
                switch (operation)
                {
                    case "+":
                        result = firstNumber.add( secondNumber);
                        break;
                    case "-":
                        result = firstNumber.subtract(secondNumber);
                        break;
                    case "*":
                        result = firstNumber.multiply(secondNumber);
                        break;
                    case "/":
                        if (!secondNumber.equals(BigDecimal.ZERO)) result = firstNumber.divide(secondNumber);
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Деление на ноль невозможно");
                            break;
                        }
                        break;
                }
                JOptionPane.showMessageDialog(null, "Результат: " + result);
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Введены неверные числа");
            }
        }
    }
}
