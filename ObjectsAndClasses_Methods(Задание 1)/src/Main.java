public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 40, 1, 500);
        basket.add("Хлеб",30, 5, 50);
        basket.add("Яйца", 200, 10, 80);
        basket.print("Корзина");

        System.out.println("\n" + "Arithmetic: " + "\n");

        Arithmetic calculationResult = new Arithmetic(123, 321);

        System.out.println("Сумма чисел = " + calculationResult.addition());
        System.out.println("Результат умножения = " + calculationResult.muptiplication());
        System.out.println("Наибольшее число = " + calculationResult.max());
        System.out.println("Наименьшее число = " + calculationResult.min());
    }
}
