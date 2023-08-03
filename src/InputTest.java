import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input user = new Input();
        System.out.println("Please enter a value to see it returned");
        System.out.println(user.getString());
        System.out.println(user.yesNo());
        System.out.println(user.getInt());
        System.out.println(user.getDouble());
        System.out.println(user.getInt(1,10));
        System.out.println(user.getDouble(1.00, 10.00));
    }
}
