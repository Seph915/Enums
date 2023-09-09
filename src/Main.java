public class Main {
    public static void main(String[] args) {

        for (Month x : Month.values()) {
            if (x.name().endsWith("Y")) {
                System.out.println(String.format("%s ends with Y", x.name()));
            } else {
                System.out.println(String.format("%s doesn't end with Y", x.name()));
            }
        }
    }
}
