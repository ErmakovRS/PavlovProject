public class TaskPavlovThirst {
    public void printThreeWords(){
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple") ;
    }
    public void checkSumSign() {
        int a = 8;
        int b = 5;
        if (a + b >= 0 ) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public  void printColor() {
        int value = 8;
        if (value >= 0) {
            System.out.println("Красный");
        } else if (value > 0 || value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зеленый");

        }
    }
    public void compareNumbers() {
        int a = 7;
        int b = 10;
        if (a >= b) {
            System.out.println(" a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

}
