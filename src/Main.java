public class Main {

    public static void main(String[] args) {

        Phone samsung = new Phone(1111111, "Galaxy S22 Ultra", 228);
        Phone apple = new Phone(2222222, "iPhone 14 Pro", 206);
        Phone xiaomi = new Phone(3333333, "Redmi Note 11 Pro", 202);

        System.out.println(samsung);
        System.out.println(apple);
        System.out.println(xiaomi);
        System.out.println();

        samsung.receiveCall("Dasha");
        apple.receiveCall("Olga");
        xiaomi.receiveCall("Masha");
        System.out.println();

        System.out.println("Number: " + samsung.getNumber());
        System.out.println("Number: " + apple.getNumber());
        System.out.println("Number: " + xiaomi.getNumber());
        System.out.println();

        samsung.receiveCall("Dasha", samsung.getNumber());
        apple.receiveCall("Olga", apple.getNumber());
        xiaomi.receiveCall("Masha", xiaomi.getNumber());

        samsung.sendMessage("Hello",1234567, 7654321, 4444444);
        apple.sendMessage(null,5555555, 7777777);
    }
}
