package ru.mirea.it.ivbo;

public class OnlinePurchase {
    public static boolean isValidINN(String inn) {
        return inn.length() == 10;
    }

    public void placeOrder(String fullName, String inn) throws InvalidINNException {
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Недействительный номер ИНН: " + inn);
        }
        System.out.println("Заказ оформлен для: " + fullName);
    }
}