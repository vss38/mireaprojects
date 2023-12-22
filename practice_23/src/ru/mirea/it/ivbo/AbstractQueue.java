package ru.mirea.it.ivbo;

import java.util.NoSuchElementException;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    @Override
    public abstract void enqueue(T element);

    @Override
    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return peek();
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        T element = peek();
        poll();
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            poll();
        }
    }

    protected abstract T peek();

    protected abstract void poll();
}