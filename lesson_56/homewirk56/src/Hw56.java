import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
Задача 1
Создать класс товар, с несколкими полями (наименование, ценаб количество). Создать объект этого класса.
Выгрузить этот объект используя ObjectOutputStream

Задача 2
Создать отдельную программу, которая загружает данные о товаре.

Задача 3
Добавить поле скидка в класс Товар в выгружающей программе (в занружающей не менять класс).
Слелать так, что бы данные о скидке не вынружались. Проверить сможет ли загружающая программа прочитать товар,
выгруженный после добавления поля скидка.


 */
public class Hw56 {
    public static void main(String[] args) throws IOException {
        Product product = new Product("BMW", 50000, 3, 0.1);

        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("hw56.dat"))) {
            os.writeObject(product);
        }
    }

}
