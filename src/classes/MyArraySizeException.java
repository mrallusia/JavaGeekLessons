package classes;

import java.io.IOException;

public class MyArraySizeException extends IOException {

    public MyArraySizeException(int length) {
        super("Ошибка длины массива, она должна быть равна 4 вместо: " + length);
    }
}
