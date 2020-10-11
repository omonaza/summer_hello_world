package JiraProject;

import java.util.Arrays;
import java.util.Scanner;

public class EV_41_InnerOuterNum_2dTry {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String sizeofOuter = "";
            do {
                System.out.println("What's your length of the outer array?");
                sizeofOuter = scanner.nextLine();
            } while (!sizeofOuter.matches("[0-9]+"));

            //  Integer sizeofOuter = scanner.nextInt();
            int[] outer = new int[sizeofOuter.length()];
            for (int i = 0; i < sizeofOuter.length(); i++) {
                String element="";
                do {
                    System.out.println("Please enter the elements of Array  ");
                    element = scanner.nextLine();
                    outer[i] = Integer.parseInt(element);
                }while(!element.matches("[0-9]+"));
            }


                System.out.println("Please enter the length of inner array");
                String sizeInner = scanner.nextLine();
                int[] inner = new int[sizeInner.length()];
                for (int i = 0; i < sizeInner.length(); i++) {
                    System.out.println("please enter the element of inner array");
                   String  element = scanner.nextLine();
                    inner[i] = Integer.parseInt(element);
                }
          //  while (!sizeInner.matches("[0-9]+")||element.matches("[0-9]+"));

            System.out.println(Arrays.toString(outer) + " and" + Arrays.toString(inner) + " is " + linearIn(outer, inner));
        }
        public static int readLenght() throws Exception{
            Scanner scanner = new Scanner(System.in);
            String sizeInString = scanner.nextLine();
            if (!sizeInString.matches("[0-9]+")) {
                throw new Exception("Invalid Number Exception");
            }
            return Integer.parseInt(sizeInString);
        }
        public static boolean linearIn(int[] outer, int[] inner) {
            int p = 0;//pointer for inner array
            if (inner.length == 0) return true;//no inner array
            for (int i = 0; i < outer.length; i++) {//iterating outer array
                if (inner[p] == outer[i]) {//found a inner array element in outer
                    p++; //increment pointer of inner array
                }
                if (p == inner.length) {//if everyone in inner array is found
                    return true;
                }
            }
            return false;
        }
}
