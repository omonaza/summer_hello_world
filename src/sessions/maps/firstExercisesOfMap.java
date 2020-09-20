package sessions.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class firstExercisesOfMap {

    public static void main(String[] args) {
        Map<String, String> emailsNamesMap = new HashMap<>();
        emailsNamesMap.put("student1@test.com", "Student1");
        emailsNamesMap.put("student2@test.com", "Student2");
        emailsNamesMap.put("student3@test.com", "Student3");

        Scanner userInput = new Scanner(System.in);
        String email = userInput.next();
        if (emailsNamesMap.containsKey(email)) {
            System.out.println(emailsNamesMap.get(email));
        } else {
            System.out.println("Sorry no data for that key!");
        }

        HashMap<String, String> testMap = copyMaps(emailsNamesMap);
        System.out.println(testMap.toString());

    }


    public static HashMap<String, String> copyMaps(Map<String, String> srcMap){
        HashMap<String, String> destMap = new HashMap<>();
        Set<String> keys = srcMap.keySet();
        for (String key: keys) {
            destMap.put(key, srcMap.get(key));
        }
        return destMap;
    }

}
