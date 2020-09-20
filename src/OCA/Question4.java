package OCA;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

        public static Integer wiggler(Integer x){
            Integer y = x + 10;
            x++;
            System.out.println(x);
            return y;
        }

        public static void main(String[] args){
            Integer dataWrapper = new Integer(5);
            Integer value = wiggler(dataWrapper);
            System.out.println(dataWrapper+value);
            System.out.println(wiggler(dataWrapper));


            List<String> names =  new ArrayList<>();
            names.add("Rob");
            names.add("Bran");
            names.add("Rick");
            names.add("Bran");
            if(names.remove("Bran")){
                names.remove("jon");
            }
            System.out.println(names);
        }
    }

