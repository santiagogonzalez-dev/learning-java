public class YearCalc {
    private int ageHuman;
    private int dayHuman;
    private int monthHuman;

    // Constructor for chooseAge()
    public YearCalc(int ageHuman) {
        this.ageHuman = ageHuman;
    }

    // Constructor for chooseBirthdayDateAndAge()
    public YearCalc(int ageHuman, int dayHuman, int monthHuman) {
        this.ageHuman = ageHuman;
        this.dayHuman = dayHuman;
        this.monthHuman = monthHuman;
    }

    // Getters and Setters
    public int getAgeHuman() {
        return ageHuman;
    }

    public void setAgeHuman(int ageHuman) {
        this.ageHuman = ageHuman;
    }

    public int getDayHuman() {
        return dayHuman;
    }

    public void setDayHuman(int dayHuman) {
        this.dayHuman = dayHuman;
    }

    public int getMonthHuman() {
        return monthHuman;
    }

    public void setMonthHuman(int monthHuman) {
        this.monthHuman = monthHuman;
    }
}
