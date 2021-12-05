package dz9.geekbrains;


public class Test {

    public static void main(String[] args) {


        String[][] arr1 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            try {
                int result = processArrayInternal(arr1);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int processArrayInternal(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Ошибка");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Ошибка " );
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка", i, j);
                }
            }

        }
        return count;
    }

}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
class MyArrayDataException extends Exception{
    public int i;
    public int j;
    MyArrayDataException(String message, int i , int j ){
        this.i = i;
        this.j = j;
    }
}