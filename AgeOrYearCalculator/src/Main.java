import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        chooseAndDo();
    }

    public static void chooseAndDo() {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Choose what do you want to know:\n" +
                "1 - Year of birth, need to give age\n" +
                "2 - Year of birth accurately, need to give birthday date\n" +
                "\n" +
                "What option do you choose? ");
        int choose = reader.nextInt();

        if (choose > 0 || choose < 4) {
            switch (choose) {
                case 1:
                    YearCalcService yearCalcCall = new YearCalcService();
                    yearCalcCall.calcYear();
                    break;
                case 2:
                    YearCalcService yearAccurate = new YearCalcService();
                    yearAccurate.calcYearAccurately();
                    break;
            }
        } else {
            System.out.println("Wrong option");
        }
    }
}