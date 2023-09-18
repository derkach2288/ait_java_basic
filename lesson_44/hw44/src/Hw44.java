import java.util.ArrayList;
import java.util.List;

public class Hw44 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(List.of(1, 3, 5, 6));
        System.out.println(list);
        System.out.println(containsTheSumOfValues(list, 11));

    }

    public static boolean containsTheSumOfValues(List<Integer> list, int n){
        if(list == null) System.out.println("Лист пустой");
        boolean res = false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == n){
                    return res = true;
                }
            }
        }
        return res;
    }
}
