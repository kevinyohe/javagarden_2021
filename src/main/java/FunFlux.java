import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FunFlux {
    public static void main(String[] args) {
        Flux<Integer> integerFlux = Flux.just(1,2,3);

        Flux<String> stringFlux = Flux.just("Hello", "foo", "bar");

        List<String> stringList = Arrays.asList("HEllo", "FOO", "bur");
        Flux<String> fluxFromList = Flux.fromIterable(stringList);

        // use the data
        integerFlux.subscribe(
                number -> System.out.println(number + ""),
                error -> System.out.println(String.format("Some error %s", error.getMessage())),
                () -> System.out.println("WE ARE DONE")
        );

        System.out.println(transformer("YO YO YO@!!"));

    }

    public static String transformer(String input){
        return input.toLowerCase(Locale.ROOT);
    }
}
