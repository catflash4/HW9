public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] expenses = new int[]{32570,50000,29870,12980,40950};
        int sum = 0;
        for (int element : expenses) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задача 2
        int[] expensesSec = new int[]{48900,57925,31876,25478,90788};
        int maxExpenses = -1;
        int minExpenses = 99999;
        for (final int current : expensesSec) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");

        //Задача 3
        int[] expensesThird = new int[]{75345,90189,32907,89126,56712};
        int weekNum = expensesThird.length;
        int sumSec = 0;
        for ( int element : expensesThird) {
            sumSec = sumSec + element;
        }
        float average = (float)sumSec/weekNum;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i-1]);
        }
    }
}