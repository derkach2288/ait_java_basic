import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // forEach
        // method reference - ссылка на метод

        List<Panda> pandas = List.of(
                new Panda("Po", 60_000),
                new Panda("Boo", 65_000),
                new Panda("Small Jay", 40_000)
        );

        // Хочу изменить исходные значения - мутировать
        // Method ref: ClassName::methodName
        pandas.forEach(Panda::eatBamboo);
        System.out.println(pandas);
        /*
        Операции бывают:
        - intermediate - промежуточные
        - terminal - конечные, последняя в цепочке, после нее не можем продолжать
         */

        // reduce - сведение к какому-то значению

        double totalWeight = pandas.stream()
                .map(Panda::getWeight)
//                .reduce(0.0, (a, b) -> a + b);
                .reduce(0.0, Double::sum);


        // limit - возвращает указанное количество эл, начиная с 1го
        List<String> animals = List.of(
                "Panda", "Lion", "Giraffe", "Monkey", "Rat", "Monkey"
        );

        List<String> limited = animals.stream().limit(2).toList();
        System.out.println(limited);

        // skip - пропускаются первые указанные количество элементов
        List<String> skipedAnimals = animals.stream().skip(2).toList();
        System.out.println(skipedAnimals);


        // distinct - оставит только уникальные элементы
        List<String> uniqueAnimals = animals.stream().distinct().toList();
        System.out.println(uniqueAnimals);

        // sorted -
        // хочу отсортировать по кол-ву букв
        List<String> sortedAnimals = animals
                .stream()
//                .sorted(Comparator.comparingInt(String::length))
                .sorted((a, b) -> Integer.compare(a.length(),b.length()) )
                .toList();
        System.out.println(sortedAnimals);


        // Terminal operation:
        // reduce, foreach
        // findAny

        Optional<Panda> po = pandas
                .stream()
                .filter(a -> a.getTitle().equals("po"))
                .findFirst();

        // anyMatch - проверяте, есть ли хотя бы один эл
        boolean poExist = pandas.stream().anyMatch(a -> a.getTitle().equals("Po"));
        System.out.println(poExist);

        //    allMatch - то же самое - но удовлетворяют ли все элементы условию?
        boolean allPandasArePo = pandas.stream()
                .allMatch(a -> a.getTitle().equals("Po"));
        System.out.println(allPandasArePo);
    }
}

