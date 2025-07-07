public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト",40);
        Matango m = new Matango('A');
        //h.hp = 100;//エラーが出る
        h.setHp(40);
        h.setName("ミナト");
        System.out.println(h.getName()+"の現在のHP: "+ h.getHp());

       King k = new King();
        k.talk(h);
        h.bye();
        /*h.sleep();
        h.seppuku();*
        /*Hero h = new Hero();
        h.hp = 40;
        h.name = "ミナト";
        System.out.println(h.name + "の現在のHP: " + h.hp);*/

        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        h.sleep();
        h.attack(m);

    }
}