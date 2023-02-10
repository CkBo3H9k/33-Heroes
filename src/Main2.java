import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int n = 11, year = 65, years = 0;
        double allAge = 0, count = 0;
        var matrix = new int[n][];
        for (int i = 0; i < matrix.length; ++i) {
            matrix[i] = new int[i];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = year--;
                allAge = allAge + matrix[i][j];
                count++;
            }
            years++;
        }
        double midLife = allAge / count;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Общее количество лет: " + allAge);
        System.out.println("Численность отряда: " + count + " человек");
        System.out.println("Средний воздаст в отряде: " + midLife + " лет");
        System.out.println("Отряд существует: " + (years - 1) + " лет");
        System.out.println();
        System.out.println("Если последнего воина не возьмут в отряд, то: " +
                "\nОтряд будет состоять из " + (count - 1) + " человек. " +
                "\nСредний возраст отряда составит: " + ((allAge - 11) / (count - 1)) + " лет. " +
                "\nИзменится средний возраст на " + (((allAge - 11) / (count - 1)) - midLife) + " года");
    }
}