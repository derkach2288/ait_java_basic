/*
Задание 3 Achilles And The Tortoise
Создайте два потока: Ахилес (AchillesThread)
и черепаха(TortoiseThread). Пусть в потоке Ахилес выводится фраза "I run fast" с интервалом полсекунды 30 раз.
Пусть в потоке черепахи выводится фраза "I just run" c интервалом две секунды 12 раз.
После того как эти потоки завершат работу выведите в консоль фразу - "Achilles can never overtake the tortoise?"
 */

public class Hw3 {
    public static void main(String[] args) {
        AchillesThread achillesThread = new AchillesThread();
        TortoiseThread tortoiseThread = new TortoiseThread();

        achillesThread.start();
        tortoiseThread.start();

        try {
            achillesThread.join();
            tortoiseThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Achilles can never overtake the tortoise?");
    }
}
