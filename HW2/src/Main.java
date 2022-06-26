// *** 1 ***
// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//-----------------------------------------------------------------------------------------------------------------
// *** 2 ***
// Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//-----------------------------------------------------------------------------------------------------------------
// *** 3 ***
// В методе main() вызвать полученный метод,
// обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

import java.util.Arrays;

public class Main {

    public static void fourAndFourArray(String[][] strings) throws MyArraySizeException {
        System.out.println(Arrays.deepToString(strings));
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                int number = 0;
                try {
                    number = Integer.parseInt(strings[i][j]);
                } catch (MyArrayDataException e) {
                    e.printStackTrace();
                }
                sum = sum + number;
            }
        }
        if(strings.length != 4 || strings[0].length != 4) throw new MyArraySizeException("Массив может быть только 4х4");
        System.out.println("Сумма чисел массива = " + sum);
    }

    public static void main(String[] args) throws MyArraySizeException {
        String[][] strGood = {{"1", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"}};
        String[][] strWorse = {{"1", "2", "3"},{"1", "2", "3"},{"1", "2", "3"},{"1", "2", "3"}};
        String[][] strBad = {{"1", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"}};

        fourAndFourArray(strGood);
        fourAndFourArray(strWorse);
        fourAndFourArray(strBad);
    }
}
