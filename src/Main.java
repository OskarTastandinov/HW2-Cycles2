public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();


    }
    public static void task1(){
        System.out.println("Домашнее задание 1   *********************************");
        int salary = 29000;
        int total = 0;
        for (int i = 0;total <= 2_459_000; i++){
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2(){
        System.out.println("Домашнее задание 2   *******************************");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = 10;j > 0; j--){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Домашнее задание 3   ******************************");
        int population = 12_000_000;
        int birthRate = 17; // на 1000 человек
        int mortality = 8; // на 1000 человек
        double popul2 = (double) birthRate / 1000;
        double mortal2 = (double) mortality / 1000;
        for (int i = 0; i < 10; i++){
            population = population + (int)(popul2 * population) - (int)(mortal2 * population);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }




    }
    public static void task4(){
        System.out.println("Домашнее задание 4   ******************************");
        int summ1 = 15000;
        int i = 0;
        int total = 0;
        for (; total < 1200000; i++){
            total = total + (total * 7/100);
            total = summ1 + total;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");

        }
    }
    public static void task5(){
        System.out.println("Домашнее задание 5   ******************************");
        int summ = 15000;
        int i = 0;
        int total = 0;
        for (; total < 1200000; i++){
            total = total + (total * 7/100);
            total = summ + total;
            if (i % 6 == 0){
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            }


        }

    }
    public static void task6(){
        System.out.println("Домашнее задание 6   ******************************");
        int summ = 15000;
        int i = 0;
        int total = 0;
        for (; i < 9 * 12; i++){
            total = total + (total * 7/100);
            total = summ + total;
            if (i % 6 == 0){
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            }


        }

    }
    public static void task7(){
        System.out.println("Домашнее задание 7   ******************************");
        int friday = 1;
        for (;friday <= 31; friday += 7){
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");

        }
    }
    public static void task8(){
        System.out.println("Домашнее задание 8   ******************************");
        int year = 1896;
        for (; year <= 2054; year+=79){

            System.out.println(year);

        }



    }
    public static void task9(){
        System.out.println("Домашнее задание 9   ******************************");
        int i = 0;
        int number = 2;
        for (; i < 10;){

            i++;
            System.out.println("2 * " + i + " = " + (number * i));
        }


    }

}
