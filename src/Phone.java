public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return this.number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ". Number: " + number);
    }

    public void sendMessage(String message, int... numbers) {
        if (message != null) {
            System.out.println("\nThe message '" + message + "' was sent to the numbers: ");
            for (int number : numbers) {
                System.out.print(number + "  ");
            }
        }
    }

    @Override
    public String toString() {
        return "Phone: number " + number +
                ", model '" + model + '\'' +
                ", weight " + weight;
    }
}
