package HomeWork2;

public class Vacation {
    public int days;
    public int money;
    public boolean foreign_passport;

    public Vacation(int days, int money, boolean foreign_passport) {
        this.days = days;
        this.money = money;
        this.foreign_passport = foreign_passport;
    }

    public void canGo() {
        if (money > 50000 && days > 5) {
            System.out.println("Можно ехать в отпуск!");
        } else {
            System.out.println("Лучше оставайся дома и высыпайся каждый день");
        }
    }
    void whereToGo() {
        if (foreign_passport) {
            System.out.println("Можно ехать на море :) ");
        }
        else {
            System.out.println("Путешествуй по России!");
        }
    }

    public void howMuchMoney() {
        System.out.println("Денег на отпуск накоплено: " + money);
    }

       void addMoney(int salary) {
        this.money = money + salary;
        }

}