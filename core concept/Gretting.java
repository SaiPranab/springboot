import java.util.Optional;

public class Gretting {
    static Optional<String> name() {
        var result = Math.random() > 0.5 ? "hello" : null;
        return Optional.ofNullable(result);
    }

    public static void main(String[] args) {
        /*
         * Optional<String> optionalName = name();
         * if (optionalName.isPresent())
         * System.out.println(optionalName.get().toUpperCase());
         * else
         * System.out.println("No data found");
         */

        /*
         * var result = name().orElse("No Data");
         * System.out.println(result);
         */

         var result = name().orElseThrow();
         System.out.println(result);
    }
}
