package task1;

import java.util.*;

public class MainApp {

    public static int arrayStringSize = 20;

    public static String[] arrayString = new String[arrayStringSize];

    public static List<String> stringArrayList = Arrays.asList(arrayString);

    public static void main(String[] args) {
        createStringArray();
        System.out.println("Размер списка = " + stringArrayList.size());

        HashSet<String> targetSet = new HashSet<>(stringArrayList);
        System.out.println("Кол-во уникальных значений =  " + targetSet.size() + "\n");

        System.out.println("Повторы:");
        HashMap <String, Integer> result = new HashMap<>();
        for (String str: targetSet) {
            result.put(str, count(str));
        }
        System.out.println(result);

        System.out.println("Список:");
        for (int i = 0; i < arrayStringSize; i++) {
            System.out.print(arrayString[i] + " ");
        }
    }
    //заполнение массива рандоными числами
    public static void createStringArray() {
      Random random = new Random();
        for (int i = 0; i < arrayStringSize; i++) {
            arrayString[i] = String.valueOf(random.nextInt(10));
        }
    }

    //счетчик
    public static Integer count(String str) {
        Integer result = 0;
        for (String strThis: stringArrayList) {
            if(strThis.equals(str))
                result++;
        }
        return result;
    }
}
