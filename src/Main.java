public class Main {
    public static void offer(int balance, int transfer) {
        int bonusStep = 100;
        int threshold = 1000;
        if (transfer >= threshold) {
            int bonus = transfer / bonusStep;
            balance = balance + transfer + bonus;
            System.out.println("Пополнение на " + transfer + " рублей");
            System.out.println("Так держать! Вы получили " + bonus + " бонусных рублей на свой счет.");
            System.out.println("Сумма вашего баланса " + balance + " рублей. Скорей беги звонить маме по межгороду и возвращайся назад!\n");
        } else {
            balance = balance + transfer;
            System.out.println("Пополнение на " + transfer + " рублей");
            System.out.println("Ты получаешь 0 бонусов :(");
            System.out.println("Баланс твоего счета всего лишь " + balance + " жалких рублей. В следующий раз старайся лучше!\n");
        }
    }
    public static void main(String[] args){
        offer(100,1000);
        offer(100, 100);
    }
}
