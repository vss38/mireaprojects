package ru.mirea.it.ivbo;

public class Matrix
{
    private double[][] mat;
    private int rows;
    private int columns;

    public Matrix(double[][] mat)
    {
        this.mat = mat;
        this.rows = mat.length;
        this.columns = mat[0].length;
    }

    public Matrix add(Matrix other)
    {
        if (rows != other.rows || columns != other.columns)
        {
            throw new IllegalArgumentException("Невозможно сложить матрицы разного размера");
        }

        double[][] resultMat = new double[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                resultMat[i][j] = mat[i][j] + other.mat[i][j];
            }
        }
        return new Matrix(resultMat);
    }

    public Matrix multiply(double scalar)
    {
        double[][] resultMat = new double[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                resultMat[i][j] = mat[i][j] * scalar;
            }
        }
        return new Matrix(resultMat);
    }

    public void print()
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(mat[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other)
    {
        if (columns != other.rows)
        {
            throw new IllegalArgumentException("Невозможно умножить матрицы: неправильные размеры");
        }

        double[][] resultMat = new double[rows][other.columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < other.columns; j++)
            {
                for (int k = 0; k < columns; k++)
                {
                    resultMat[i][j] += mat[i][k] * other.mat[k][j];
                }
            }
        }
        return new Matrix(resultMat);
    }
}