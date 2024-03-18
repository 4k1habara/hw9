public class Main {
    public static void main(String[] args) {
        //task1
        int[] payments = {1, 2, 3, 4, 5};
        int total = 0;
        for (int i : payments) {
            total += i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        //task2
        int minPayment = payments[0];
        int maxPayment = 0;
        for (int i : payments) {
            if (i > maxPayment) {
                maxPayment = i;
            }
            if (i < minPayment) {
                minPayment = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +  minPayment + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxPayment + " рублей");

        //task3
        int weeks = payments.length;
        float average = 0;
        average = total / weeks;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int index = reverseFullName.length - 1;
        for (; index > -1; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}