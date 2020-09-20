package HomeWork3;

public class JavaStringReplaceMethod {
    public static String ReplaceMethod (String str){
    return str.replace("Java","Kava");

    }

    public static void main(String[] args) {
        String str = "Java is a programming language. Java is a platform. Java is an Island.";
        System.out.println(ReplaceMethod(str));
    }
}
