public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][] {
                {65},
                {64, 63},
                {62, 61, 60},
                {59, 58, 57, 56},
                {55, 54, 53, 52, 51},
                {50, 49, 48, 47, 46, 45},
                {44, 43, 42, 41, 40, 39, 38},
                {37, 36, 35, 34, 33, 32, 31, 30},
                {29, 28, 27, 26, 25, 24, 23, 22, 21},
                {20, 19, 18, 17, 16, 15, 14, 13, 12, 11}
        };
        int allAge = 0;
        int count = 0;
        int years = 0;
        int midlife;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                allAge = allAge + array[i][j];
                System.out.print(array[i][j] + " ");
                count++;
            }
            System.out.println();
            years++;
        }
        midlife = allAge / count;
        System.out.println();
        System.out.println("Общий возраст: " + allAge + " лет");
        System.out.println("Численность отряда: " + count + " человек");
        System.out.println("Средний возраст: " + midlife + " лет");
        System.out.println("Отряд существует: " + years + " лет");
        System.out.println();
        double allAge2 = allAge - 11;
        double count2 = count - 1;
        double midlife2 = allAge2 / count2;
        double changed = midlife2 - midlife;
        System.out.println("Если 11-и летний воин не поступит на службу:");
        System.out.println("Общий возраст: " + allAge2 + " лет");
        System.out.println("Численность отряда: " + count2 + " человек");
        System.out.println("Средний возраст: " + midlife2 + " лет");
        System.out.println("Отряд существует: " + years + " лет");
        System.out.println();
        System.out.println("Как изменится средний возраст?");
        System.out.println("Как изменится на: " + changed + " года");

    }
}