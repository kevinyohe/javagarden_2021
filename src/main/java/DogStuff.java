public class DogStuff {


    public static void main(String[] args) {
        // Highly coupled way
        // Every time we update Dog we will have to edit this code.
        Barker barker = new Dog();
        Barker bigBarker = new Direwolf();

        // New Way
        Barker newDog = getDirewolf();
        Barker littleDog = getDog();

        barker.bark();
        bigBarker.bark();
        newDog.bark();
        littleDog.bark();
        SomeErrorDetail.SomeErrorDetailBuilder error = SomeErrorDetail.builder().field("adsf").fieldName("aaa").errorDescription("conent");
        System.out.println(error.toString());


    }

    public static Direwolf getDirewolf(){
        return new Direwolf();
    }

    public static Dog getDog(){
        return new Dog();
    }
}
