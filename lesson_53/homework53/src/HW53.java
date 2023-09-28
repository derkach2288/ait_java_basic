/*
Задача 1

Дан файл с текстом вида:

jack:2000
john:2900
greta:3100
john:1300
nick:1200
greta:500
...

т.е. имя и сумма оплпты. Ваша задача прочитать фпйл, и сформировать два фпйла: part1 cо списком тех,
кому перечисленно в сумме менее 2000 и part2 cо списком тех, кому перечисленно в сумме более 2000
Обратите внимание, если в исходном фпйле john фигурирует дважды (как в нашем примере), это означает
что один и тот же человек и ему выплачивали дважды.
Таким образом, в итоговом файле для jhon-а должна быть запись
john:4200
и эта строка должна ьыть в файле part2
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HW53 {
    public static void main(String[] args) {

//        System.out.println(readFile());
        stringToMap(readFile());
        listPersons(stringToMap(readFile()));

        writeToFile(listPersons(stringToMap(readFile())));

    }

    public static String readFile() {

        try (FileReader fr = new FileReader("hw53_data.txt")) {
            int data;
            StringBuilder sb = new StringBuilder();
            while ((data = fr.read()) != -1) {
                sb.append((char) data);
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Integer> stringToMap(String str) {
        Map<String, Integer> res = new HashMap<>();
        String[] arrStr = str.split("\n");
        for (String person : arrStr) {
            String[] arrPerson = person.split(":");
            String name = arrPerson[0];
            Integer payment = Integer.valueOf(arrPerson[1]);
            Integer sumPayment = res.getOrDefault(name, 0) + payment;
            res.put(name, sumPayment);
        }
        return res;
    }

    public static List<String> listPersons(Map<String, Integer> map) {

        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        Set<Map.Entry<String, Integer>> entriesMap1 = map.entrySet();
        for (Map.Entry<String, Integer> entry : entriesMap1) {
            if (entry.getValue() <= 2000) {
                part1.append(entry.getKey() + ":");
                part1.append(entry.getValue() + "\n");
            } else {
                part2.append(entry.getKey() + ":");
                part2.append(entry.getValue() + "\n");
            }
        }
        List<String> res = new ArrayList<>();
        res.add(part1.toString());
        res.add(part2.toString());
        return res;

//        try(FileWriter fw1 = new FileWriter("part1.txt")) {
//            fw1.write(part1.toString());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try(FileWriter fw2 = new FileWriter("part2.txt")) {
//            fw2.write(part2.toString());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }

    public static void writeToFile(List<String> list) {
        try (FileWriter fw1 = new FileWriter("part1.txt")) {
            fw1.write(list.get(0));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw2 = new FileWriter("part2.txt")) {
            fw2.write(list.get(1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
