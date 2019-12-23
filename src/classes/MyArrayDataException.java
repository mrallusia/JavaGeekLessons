package classes;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException(int i, int j) {
        super("В массеве присутствует символ не переводимый в числовое значение на строке: "+ i + " в столбце: " + j);
    }
}
