package HomeWork2;

public class Main {
    public static void main(String[] args) {
        Vacation myVac = new Vacation(7, 60000, true) {

        };
        myVac.addMoney(10000);
        myVac.canGo();
        myVac.whereToGo();
        myVac.howMuchMoney();

    }
}
