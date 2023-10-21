package ru.mirea.it.ivbo;

public interface Printable
{
    void print();
}

class Magazine implements Printable
{
    private String title;

    public Magazine(String title)
    {
        this.title = title;
    }

    @Override
    public void print()
    {
        System.out.println(title);
    }

    public static void printMagazines(Printable[] printable)
    {
        for (Printable p : printable) {
            if (p instanceof Magazine)
                p.print();
        }
    }
}

class Book implements Printable
{
    private String title;

    public Book(String title)
    {
        this.title = title;
    }

    @Override
    public void print()
    {
        System.out.println(title);
    }

    public static void printBooks(Printable[] printable)
    {
        for (Printable p : printable) {
            if (p instanceof Book)
                p.print();
        }
    }
}