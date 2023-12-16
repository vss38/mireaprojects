package ru.mirea.it.ivbo;

public class Main {
    public static void main(String[] args) {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        String fullName = "Иванов Иван Иванович";
        String invalidINN = "12345";
        String validINN = "1234567890";

        try {
            onlinePurchase.placeOrder(fullName, invalidINN);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка при оформлении заказа: " + e.getMessage());
        }

        try {
            onlinePurchase.placeOrder(fullName, validINN);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка при оформлении заказа: " + e.getMessage());
        }
    }
}