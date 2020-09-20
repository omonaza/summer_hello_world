package sessions.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
public class WrapperClassExercises {
       // Write a Java program to remove the third element from a array list

    public static void removeThirdElement(ArrayList<String> list){
        if (list.size() >= 4){
            list.remove(3);
        } else {
            System.out.println("There is no third element!");

        }
    }



    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("red");
        colorList.add("blue");
        colorList.add("white");
        colorList.add(null);

        // unboxing the to Array,from ArrayList
        String[] colorsArray = colorList.toArray(new String[0]);
        System.out.println(Arrays.toString(colorsArray));

        String salary = "3457";
        String tax = "10";

        double salaryParsed = Double.parseDouble(salary);
        int taxParsed = Integer.parseInt(tax);

        Integer convertedTaxWithValue = Integer.valueOf(tax);
        Double convertedSalaryWithValue = Double.valueOf(salary);

        Double taxDeductedSalary = salaryParsed - (salaryParsed * taxParsed / 100);

        System.out.println("Salary "+ salaryParsed+"\ntax "+taxParsed+"\nTaxDeductedSalary "+taxDeductedSalary);

        for (int i=0; i < colorList.size(); i++){
            if (colorList.get(i) != null)
                System.out.println(colorList.get(i).toUpperCase());
        }
        removeThirdElement(colorList);
        System.out.println(colorList.toString());



    }
}
