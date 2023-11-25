package ru.mirea.it.ivbo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape
{
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);

    public Color getColor()
    {
        return color;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}

class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}

class Circle extends Shape
{
    private int radius;

    public Circle(Color color, int x, int y, int radius)
    {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), radius * 2, radius * 2);
    }
}

class ShapeCanvas extends JPanel
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public ShapeCanvas()
    {
        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++)
        {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int size = random.nextInt(100);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean())
            {
                int width = random.nextInt(100);
                int height = random.nextInt(100);
                shapes[i] = new Rectangle(color, x, y, width, height);
            } else
            {
                shapes[i] = new Circle(color, x, y, size);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        for (Shape shape : shapes)
        {
            shape.draw(g);
        }
    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(WIDTH, HEIGHT);
    }
}