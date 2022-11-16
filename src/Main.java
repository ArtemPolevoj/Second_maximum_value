import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] value = new int[30];
        for (int i = 0; i< value.length;i++){
            value[i]  = (int)(Math.random()*100);
            System.out.print(value[i] + ", ");
        }

        int max2 = secondMax(value);

        System.out.println("\nОтсортирован");
        Arrays.sort(value);
        for (int l:value
        ) {
            System.out.print(l+", ");
        }
        System.out.println("\nВторое максимальное значение- "+ max2);
    }
    static  int secondMax(int[] array){
        int max2 = array[0], max1 = array[1];

        for (int j : array) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2 && j < max1) {
                max2 = j;
            }
        }
        return max2;
    }
}
