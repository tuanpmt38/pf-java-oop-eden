public class Work {
    public static void main(String[] args) {
        System.out.println("adam đươc sinh ra:");
        Human adam = new Human();
        System.out.println("eva được sinh ra: ");
        Human eva = new Human();

        Gol.Say("không được ăn táo, nếu ăn sẽ chết");
        Snake snake = new Snake();
        snake.Say("ăn táo đi ngon lắm, không chết đâu");
        Apple apple = new Apple(6);
        while (!apple.isEmpty()){
            System.out.println("eva ăn một miếng táo");
            eva.Eat(apple);
            System.out.println("adam ăn một miếng táo");
            adam.Eat(apple);
        }
        System.out.println("hết táo");
        System.out.println("adam và eva đi ngủ");
        adam.Sleep();
        eva.Sleep();
        Gol.Say("Chúa phán: "+"Eva bà sẽ phải vâng lời chồng và đau đớn khi sinh con," +
                " Adam ngươi sẽ phải cuốc đất tròng rau mà ăn");
        System.out.println("---The end---");
    }
}
