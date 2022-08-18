public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(700,3,"male","muu1");
        Cow cow1 = new Cow(1200,5,"male","muu2");
        Cow cow2 = new Cow(700,3,"male","Misha");
        Cow cow3 = new Cow(700,3,"female","Masha");
        Cow cow4 = new Cow(700,3,"female","Sonya");
        Cow[]cows={cow,cow1,cow2,cow3,cow4};

        Sheep sheep = new Sheep(80,3,"male","baa1");
        Sheep sheep1 = new Sheep(50,2,"female","baa2");
        Sheep sheep2 = new Sheep(80,3,"male","baa3");
        Sheep[] sheeps = {sheep,sheep1,sheep2};

        Horse horse = new Horse(1200,7,"male","Burushka");
        Horse horse1 = new Horse(600,7,"male","YuliyCesar");
        Horse [] horses = {horse,horse1};

        Sheep []sheeps1={sheep};
        Cow []cows1={cow1};
        Horse []horses1={horse};

        Farm farm1 = new Farm("cansas.1/4",cows,horses,sheeps,"Jonathan Kent");
        Farm farm2 = new Farm("cansas.1/4",cows1,horses1,sheeps1,"Clark Kent");

        System.out.println(farm1.getHorses()[0].toString());
    }
}