package Practice;

public class InterviewQuestion {
//   write method which sums all elements of the integer array list

    public static Integer sumElements (Integer[] num){
        Integer sum = 0;
        for (int i = 0; i<num.length;i++){
            sum+=num[i];
        }

     return sum;
    }

    public static void main(String[] args) {
        Integer [] num = {1,2,3,4,5,6};
        System.out.println(sumElements(num));
    }

}