package presentations;

public class StringPresantation {


    public static void main(String args[]){
        String s1="java";//creating string by java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3= new String("example");//creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



        String str = "abc";
        String str2 = "abc";

        // Note that this == compares whether
        // str and str2 refer to same object or not
        if (str == str2)
            System.out.println(true);
        else
            System.out.println(false);



        String a1 = new String("abc");
        String a2 = new String("abc");

        // Note that this == compares whether
        // a1 and a2 refer to same object or not
        if (a1 == a2)
            System.out.println(true);
        else
            System.out.println(false);


//        By equals() method
//        By = = operator
//        By compareTo() method


//
//        String compare by compareTo() method
//        The String compareTo() method compares values lexicographically
//        and returns an integer value that describes if first string is less than,
//        equal to or greater than second string.
//
//        Suppose b1 and b2 are two string variables. If:
//
//        b1 == b2 :0
//        b1 > b2   :positive value
//        b1 < b2   :negative value


        String b1="Sachin";
        String b2="Sachin";
        String b3="Ratan";
        System.out.println(b1.compareTo(b2));//0
        System.out.println(b1.compareTo(b3));//1(because b1>b3)
        System.out.println(b3.compareTo(b1));//-1(because b3 < b1 )



        String v1="Sachin";
        String v2="Sachin";
        String v3=new String("Sachin");
        System.out.println(v1==v2);                //true (because both refer to same instance)
        System.out.println(v1==v3);               //false(because v3 refers to instance created in nonpool)



        String c1="Sachin";
        String c2="SACHIN";
        System.out.println(c1.equals(c2));                //false
        System.out.println(c1.equalsIgnoreCase(c2));      //true
    }

}
