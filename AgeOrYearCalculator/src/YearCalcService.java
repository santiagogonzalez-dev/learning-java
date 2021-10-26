import java.time.LocalDate;
import java.util.Scanner;

public class YearCalcService {

    private final Scanner reader = new Scanner(System.in).useDelimiter("\n");

    // Parsing only the age to get an approximate year of birth
    private YearCalc chooseAge() {
        System.out.print("Enter age: ");
        int ageHuman = reader.nextInt();

        YearCalc approxYear = new YearCalc(ageHuman);
        return approxYear;
    }

    public void calcYear() {
        YearCalc approxYear = chooseAge();
        int actualYear = LocalDate.now().getYear();
        int approxAge = (actualYear - approxYear.getAgeHuman());
        System.out.println("Birth year of the person is between " + (approxAge - 1) + " and " + approxAge);
    }


    // Parsing a birthday date to get an accurate year of birth
    public YearCalc chooseBirthdayDateAndAge() {
        System.out.println("Please provide the date of the birthday, and the age of the person");
        System.out.print("Enter the day: ");
        int dayHuman = reader.nextInt();
        System.out.print("Enter the month: ");
        int monthHuman = reader.nextInt();
        System.out.print("Enter the age: ");
        int ageHuman = reader.nextInt();

        YearCalc birthdayDate = new YearCalc(ageHuman, dayHuman, monthHuman);
        return birthdayDate;
    }

    public void calcYearAccurately() {
        YearCalc yearAccurately = chooseBirthdayDateAndAge(); // Instantiate an aux obj

        LocalDate actualDate = LocalDate.now();
        LocalDate humanDate = LocalDate.of(LocalDate.now().getYear(), yearAccurately.getMonthHuman(), yearAccurately.getDayHuman());

        System.out.println();
        System.out.println("Actual date: " + actualDate);
        System.out.println("Date entered: " + humanDate);

        if (actualDate.isAfter(humanDate)) {
            System.out.print("\nThe birthday has passed, so the year of birth is: " +
                    (LocalDate.now().getYear() - yearAccurately.getAgeHuman()) + "\n");
        } else if (actualDate.isBefore(humanDate)) {
            System.out.println("\nThe birthday has not passed yet, so the year of birth is: " +
                    (LocalDate.now().getYear() - (yearAccurately.getAgeHuman() + 1)));
        } else if (actualDate.isEqual(humanDate)) {
            System.out.println("\nThe birthday is today, so the year of birth is: " +
                    (LocalDate.now().getYear() - yearAccurately.getAgeHuman()) + "\n");
        }
    }
}