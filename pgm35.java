public class pgm35 {
    public void Rank(int marks) {
        if (marks >= 600) {
            System.out.println("Rank is A !");

        } else if (marks >= 500) {
            System.out.println("Rank is B !");
        } else {
            System.out.println("Rank is C !");
        }
    }

    public static void Ranks(int marks) {
        if (marks >= 600) {
            System.out.println("Rank is A !");

        } else if (marks >= 500) {
            System.out.println("Rank is B !");
        } else {
            System.out.println("Rank is C !");
        }
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.Rank(40);
        Ranks(600);
    }
}
