public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.println(returnAdjective() + "-" + returnNoun());
    }

    public static int randomNum() {
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }
    public static String returnAdjective() {
        String arrayOne[] = {"Impossible","Purple","Small","Thoughtful","Plump","Fluffy","Photogenic","Brave","Agreeable","Bold"};
        return arrayOne[randomNum()];
    }
    public static String returnNoun() {
        String arrayTwo[] = {"Table","Chair","Pen","India","Window","Computer","Agra","Team","Van","Train"};
        return arrayTwo[randomNum()];
    }
}
