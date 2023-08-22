package ait.string;

public class StringBuilderAppl {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        String str = builder.toString();
        System.out.println(str);
        System.out.println(builder);

        builder.append(11); // типа concat, только меняет сам билдер, а не создает новый, как в стринг
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
        str = builder.toString();
        System.out.println(str);

        str = stringManipulation("Hello Cohort 31.1");
        System.out.println(str);
    }

    private static String stringManipulation(String str){
        StringBuilder builder = new StringBuilder("{ ");
        builder.append(str).append(" }");
        return builder.toString();
    }
}
