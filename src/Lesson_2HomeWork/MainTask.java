package Lesson_2HomeWork;

public class MainTask {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println(myMethod(arr));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static int myMethod(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int temp = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Длинна массива больше 4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Аргументов массива != 4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    temp += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Вы ввели недопустимый символ! Номер строки: " + i + "x" + j);
                }
            }
        }
        return temp;
    }
}
