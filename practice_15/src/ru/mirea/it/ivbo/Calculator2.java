package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator2
{
    private static JTextField display;

    public Calculator2()
    {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setMargin(new Insets(10, 10, 10, 10));
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        frame.add(display, BorderLayout.NORTH);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String buttonText : buttons) {
            JButton button = new JButton(buttonText);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(button);
            button.addActionListener(new ButtonClickListener());
        }
        frame.add(panel);
        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) display.setText(calculate(display.getText()));
            else display.setText(display.getText() + buttonText);
        }
    }

    private static String calculate(String expression)
    {
        try
        {
            String result = String.valueOf(eval(expression));
            return result;
        }
        catch (Exception ex)
        {
            return "Ошибка";
        }
    }

    private static double eval(String expression)
    {
        return new Object()
        {
            int pos = -1, ch;

            void nextChar()
            {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat)
            {
                while (ch == ' ') nextChar();
                if (ch == charToEat)
                {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse()
            {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new RuntimeException("Неправильное выражение: " + (char) ch);
                return x;
            }

            double parseExpression()
            {
                double x = parseTerm();
                for (; ; )
                {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm()
            {
                double x = parseFactor();
                for (; ; )
                {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor()
            {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('('))
                {
                    x = parseExpression();
                    eat(')');
                }
                else if ((ch >= '0' && ch <= '9') || ch == '.')
                {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                }
                else throw new RuntimeException("Неправильное выражение: " + (char) ch);

                if (eat('^')) x = Math.pow(x, parseFactor());

                return x;
            }
        }.parse();
    }
}
