package lambDas;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambDas {
    public static void main(String[] args) {

       // Faker f = new Faker();

       // System.out.println(Faker.instance().name().firstName());
       // lambda with list
        List<String> ls =  new ArrayList<>();
        for(int i = 0; i <=10 ; i ++){
            ls.add(Faker.instance().name().firstName());
        }
        ls.forEach(x-> System.out.println(x));

//
//        Map<String, String> mp = new HashMap<>();
//        mp.forEach((key,value) -> System.out.println());
    }
}