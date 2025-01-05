//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();

        try{
            generator.NullPointException();
        } catch (NullPointerException e) {
            System.out.println("Exception occured!");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}