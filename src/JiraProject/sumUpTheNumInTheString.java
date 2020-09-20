package JiraProject;

public class sumUpTheNumInTheString {
  public   static int sumFromString(String str){
        int sum=0;
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                sum+=(ch-'0');
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String num = "year111month01";
        System.out.println(sumFromString(num));
    }
}
