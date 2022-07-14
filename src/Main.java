public class Main {
    public static void main(String[] args) {

    //Задание 1
    byte a = 12;
    short b = 456;
    int c = 33800;
    long d = 15L;

    float e = 3.14f;
    double f = 15.389;

    //Задание 2
    float boxerOne = 78.2f;
    float boxerTwo = 82.7f;
    float boxerAmountWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксёров " + boxerAmountWeight + " кг");
    float boxerDifferenceWeight = Math.abs(boxerOne - boxerTwo);
        System.out.println("Разница в весе боксёров " + boxerDifferenceWeight + " кг");

    //Задание 3
    int bananas = 80;
    int milk = 105;
    int icecream = 100;
    int eggs = 70;
    int milkShake = (5 * bananas) + (2 * milk) + (2 * icecream) + (4 * eggs);
        System.out.println("Вес молочного коктейля " + milkShake + " грамм");
    float milkShakeKG = (float) milkShake / 1000;
        System.out.println("Вес молочного коктейля " + milkShakeKG + " килограмм");

    //Задание 4
    int dropWeight = 7000;
    int day250 = 250;
    int day500 = 500;
    int drop250 = dropWeight / day250;
        System.out.println("Вес будет скидываться " + drop250 + " дней при похудении 250 грамм в день");
    int drop500 = dropWeight / day500;
        System.out.println("Вес будет скидываться " + drop500 + " дней при похудении 500 грамм в день");
    float arithmeticMean  = ((drop250 + drop500) / 2) - (((drop250 + drop500) / 2) % 1);
        System.out.println("Среднее арифметическое дней равно " + arithmeticMean);


    //Задание 5
    int Masha = 67_760;
    int Denis = 83_690;
    int Kristina = 76_230;
    float up = 0.1f;
    float MashaUp = (float) Masha + (Masha * up);
    float DenisUp = (float) Denis + (Denis * up);
    float KristinaUp = (float) Kristina + (Kristina * up);
    int annualSalaryMasha = Masha * 12;
    int annualSalaryDenis = Denis * 12;
    int annualSalaryKristina = Kristina * 12;
    float annualSalaryMashaUp = MashaUp * 12;
    float annualSalaryDenisUp = DenisUp * 12;
    float annualSalaryKristinaUp = KristinaUp * 12;
    float incomeMasha = annualSalaryMashaUp - annualSalaryMasha;
    float incomeDenis = annualSalaryDenisUp - annualSalaryDenis;
    float incomeKristina = annualSalaryKristinaUp - annualSalaryKristina;
        System.out.println("Маша теперь получает " + MashaUp + " рублей в месяц. Годовой доход вырос на " + incomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + DenisUp + " рублей в месяц. Годовой доход вырос на " + incomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + KristinaUp + " рублей в месяц. Годовой доход вырос на " + incomeKristina + " рублей.");
    }
}