import java.util.ArrayList;
import static edu.princeton.cs.algs4.StdRandom.bernoulli;
import static edu.princeton.cs.algs4.StdRandom.uniform;

public class StdRandomTester {

    public static void main(String[] args) {
        ArrayList thousand = new ArrayList();
        ArrayList tenThousand = new ArrayList();

        for (int i = 0; i < 1000; i++) {
            thousand.add(uniform(1000));
        }
        for (int i = 0; i < 10000; i++) {
            tenThousand.add(bernoulli(0.5));
        }
        System.out.println("1000 uniform random numbers between 0 and 999: " + thousand);
        System.out.println("10000 Bernoulli random booleans: " + tenThousand);
    }
}

