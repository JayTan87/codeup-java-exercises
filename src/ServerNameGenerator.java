public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.printf("Here is your server name: %n%s-%s",returnAdjective(), returnNoun());
    }

    public static int randomNum() {
        int max = 9;
        int min = 1;
        int range = 10;
        return (int) (Math.random() * range) ;
    }
    private static String returnAdjective() {
        String[] arrayOne = {"Impossible","Purple","Small","Thoughtful","Plump","Fluffy","Photogenic","Brave","Agreeable","Bold"};
        return arrayOne[randomNum()];
    }
    private static String returnNoun() {
        String[] arrayTwo = {"Table","Chair","Pen","India","Window","Computer","Agra","Team","Van","Train"};
        return arrayTwo[randomNum()];
    }
}
