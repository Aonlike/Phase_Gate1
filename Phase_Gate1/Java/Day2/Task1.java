public class Task10 {

    public static void main(String[] args) {
        System.out.print(NumberOfYears(40, 20));
    }

    public static int NumberOfYears(int fathersAge, int sonsAge) {
        int years = fathersAge - 2 * sonsAge;
        return years;
    }
}