package ru.mirea.it.ivbo;

public class GenericArray<E>
{
    private E[] array;

    public GenericArray(int size)
    {
        array = (E[]) new Object[size];
    }

    public void set(int index, E element)
    {
        array[index] = element;
    }

    public E get(int index)
    {
        return array[index];
    }
}