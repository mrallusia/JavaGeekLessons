import classes.MyArraySizeException;
import classes.MyArrayDataException;

/**
 * Создано be Pavel 23.12.19 для урока Exception
 */
public class MainClass {

    public static void main(String[] args) {

        //создаём массивы 4х3, 4х4, 4х4 с ошибкой
        String[][] srt43 = new String[][]{{"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}};
        trySummMassive(srt43);

        String[][] srt44 = new String[][]{{"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}};
        trySummMassive(srt44);

        String[][] srt4text = new String[][]{{"0", "1", "2", "Текст"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}};
        trySummMassive(srt4text);

    }

    // создадим метод для проверки исключений
    public static void trySummMassive (String[][] srt) {
        int summ; // для суммирования массива


        if (srt.length != 4) {
            try {
                throw new MyArraySizeException(srt.length);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }
        else {


            summ = 0;
            for (int i = 0; i < srt.length; i++) {
                for (int j = 0; j < srt.length; j++) {

                    //проверка строчных выражениq на наличие 0-9 меж (^)началом и ($)концом строки, (+)один или более раз
                    if (srt[i][j].matches("^[0-9]+$")) {
                        summ += Integer.parseInt(srt[i][j]);
                    }
                    else{
                        try {
                            throw new MyArrayDataException(i, j);
                        } catch (MyArrayDataException e) {
                            e.printStackTrace();
                            summ +=0;
                        }
                    }

                }
            }
            System.out.println("Сумма массива: " + summ);

        }

    }


}
