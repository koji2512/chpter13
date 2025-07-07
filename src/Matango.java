public class Matango {
    String name;
    int hp;
    final int LEVEL = 10;
    char suffix;
    public Matango(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}