package Lesson_2;

public class FactorialException extends Exception {
    private int number;
    String nameField;

    public int getNumber() {
        return number;
    }

    public FactorialException(String msg, int number, String nameField) {
        super(msg);
        this.number = number;
        this.nameField = nameField;
    }
}

class Factorial {
    public static int getfactorial(int num) throws FactorialException {
        int res = 1;
        if (num < 1) throw new FactorialException("Число не может быть меньше 1", num, "поле статуса");

        for (int i = 1; i <= num ; i++) {
            res *=i;
        }

        return res;
    }
}

class MainExFactorial {
    public static void main(String[] args) {
        try {
            int res = Factorial.getfactorial(-10);
        } catch (FactorialException e) {
            System.out.println(e.getMessage() + " " + e.nameField);
            e.printStackTrace();
        }
    }
}