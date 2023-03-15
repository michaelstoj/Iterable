import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class tests the MyIterable class.
 * @author: Connor Norris & Mike Stoj
 * @edu.uwp.cs.340.course.CSCI 340 - Data Structures
 * @edu.uwp.cs.340.assignment.Section 01
 * @bugs : None
 */

public class MyIterableTester {
    public static void main(String[] args) {

        List<String> strArrayList = new ArrayList<>();
        List<Integer> intArrayList = new ArrayList<>();
        List<Double> dblArrayList = new ArrayList<>();

        try {
            File myFile = new File("C:\\Users\\mikes\\Documents\\School\\PARKSIDE SPRING\\Algorithms\\Program 1\\src\\input.txt");
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNext()) {
                if(myReader.hasNextInt()){
                    intArrayList.add(myReader.nextInt());
                }
                else if (myReader.hasNextDouble()){
                    dblArrayList.add(myReader.nextDouble());
                }
                else if (myReader.hasNext()) {
                    strArrayList.add(myReader.next());
                }
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        MyIterable<String> strIterable = new MyIterable<>(strArrayList.toArray(new String[strArrayList.size()]));
        MyIterable<Integer> intIterable = new MyIterable<>(intArrayList.toArray(new Integer[intArrayList.size()]));
        MyIterable<Double> dblIterable = new MyIterable<>(dblArrayList.toArray(new Double[dblArrayList.size()]));

        System.out.println("My friends:");
        for (String strPrint : strIterable)
            System.out.print(strPrint + " ");
        lineBreak();
        System.out.println("My numbers:");
        for (Integer intPrint : intIterable)
            System.out.print(intPrint + " ");
        lineBreak();
        System.out.println("My scores:");
        for (Double dblPrint : dblIterable)
            System.out.print(dblPrint + " ");
        lineBreak();

    }
    public static void lineBreak() {
        System.out.println("\n----------+---------");
    }

}
