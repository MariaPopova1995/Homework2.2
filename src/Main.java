//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int ticket = 13676; // стоимость авиабилета
        int bonus = 20; // стоимость бонусной 1 мили

        System.out.println("Колличество начисленных миль за покупку авиабилета:");
        System.out.println((ticket / bonus) + " бонусных миль");

    }
}