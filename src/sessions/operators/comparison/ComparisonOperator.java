package sessions.operators.comparison;

public class ComparisonOperator {


    public static void main(String[] args) {
        int ageLimit = 60;
        int userAge = 20;
        // 20                60
        // is userAge more than ageLimit ?
        System.out.println("Is user a senior ? " + (userAge > ageLimit));


        double priceOfCake = 7.99;
        double priceOfJuice = 7.99;
        // is 7.99 equal to 7.99 ?
        System.out.println("Are the two prices equal " + (priceOfCake == priceOfJuice));


        double priceOfTheOnePoundApple = 1.99;
        // is 7.99 equals to 1.99 ?
        System.out.println("Are Apples and cake same price " + (priceOfCake == priceOfTheOnePoundApple));

        double evilNum = 666;
        double userInput = 666;
        // is 666 not equal to 666
        System.out.println("Is UserNumberInput valid number " + (evilNum != userInput)); // false


        int weekend = 7;
        int today = 2;
        // yes i work, bc today is not weekend
        System.out.println("Do i work today, today is 2day " + (weekend != today)); // true


        int lotteryWinnerNumber = 123456;
        int userLotteryNumber = 1234;
        // simplified coding is given
        boolean isKeepPlaying = lotteryWinnerNumber != userLotteryNumber;

        System.out.println(" Should i keep playing " + isKeepPlaying);
        //


        //hard coding is given below
        int lotteryWinnerNumber1 = 123456;
        int userLotteryNumber2 = 1234;

        System.out.println("Should I keep playing " + (lotteryWinnerNumber1 != userLotteryNumber2));

        double minimumGasAmount = 1.0 / 4;
        double carCurrentGasAmount = 1.0 / 6;
        boolean turnOn = carCurrentGasAmount < minimumGasAmount;


        System.out.println("is gas light on " + turnOn);
        System.out.println("Should be gus light on " + turnOn);

        char requirement = 'M';
        char userGender = 'F';

        boolean shouldBeReviewed = requirement == userGender;

        System.out.println("Should the Female reviewed as a candidate " + shouldBeReviewed);


        int requiredYearsOfExperience = 6;
        int applicantYearsOfExperience = 4;

        boolean isApplicantExperienced = applicantYearsOfExperience >= requiredYearsOfExperience;

        System.out.println("Is applicant experienced " + isApplicantExperienced);


        String whatChildWants = " lollipop";
        String whatTheParentBought = "Chocolate";


        Boolean isChildHappy = whatTheParentBought == whatChildWants;
        boolean isChildCrying = whatTheParentBought != whatChildWants;

        System.out.println(" Is child Happy " + isChildHappy);
        System.out.println("is Child crying " + isChildCrying);


        // should i give a discount
        // movie theater
        // teenagers age < 20
        //seniors = age >= 60

        int userGivenAge = 18;
        //18               //18
        boolean isDiscount = (userAge < 20) || (userAge >= 60);

        System.out.println("Give Discount " + isDiscount);


        // codes with Mirlan codes with Mirlan codes with Mirlan codes with Mirlan codes with Mirlan codes with Mirlan


        int apples = 10;
        int peaches = 16;
        boolean isEqual = apples == peaches;
        boolean isNotEqual = apples != peaches;
        boolean isAppleIsGreaterThanPeaches = apples > peaches;
        boolean isAppleIsLessTahnPeaches = apples < peaches;
        boolean isAppleIsGreaterThanOrEqualToPeaches = apples >= peaches;
        boolean isAppleIsLessTahnOrEqualToPeaches = apples <= peaches;


        System.out.println(apples + " is equal to "+peaches+" = "+isEqual);
        System.out.println(apples + " is not equal to "+peaches+" = "+isNotEqual);
        System.out.println(apples + " is greater than "+peaches+" = " + isAppleIsGreaterThanPeaches);
        System.out.println(apples + " is less than "+peaches+" = " + isAppleIsLessTahnPeaches);
        System.out.println(apples + " is greater than or equal to "+peaches +" = "+isAppleIsGreaterThanOrEqualToPeaches);
        System.out.println(apples + " is less than or equal to "+peaches+" = "+isAppleIsLessTahnOrEqualToPeaches);


        // codes with Mirlan codes with Mirlan codes with Mirlan codes with Mirlan codes with Mirlan codes with Mirlan



        int ageOfAnn = 18;
        int ageOfBob = 15;
        char maritalStatus = 'u';
        int age = 33;
        int height = 181;
        int weight = 71;
        int y, m, d;


        boolean isEligible = (maritalStatus == 'u') && (age > 21 && age <= 35) && (height > 180) && (weight > 70 && weight < 80);
        boolean experiment1 = (ageOfAnn < ageOfBob) && (ageOfAnn >= ageOfBob) || (ageOfBob != ageOfBob);
        boolean experiment2 = !((ageOfAnn > ageOfBob) && (ageOfAnn <= ageOfBob) || !(ageOfAnn == ageOfBob));


        y = 2011;
        m = 9;
        d = 14;
        boolean isDateInRange = (y <= 2010) && (d >= 1 && d <= 15) && (m <= 10 && m >= 1);
        String experiment3 = (y <= 2010) ? "Yes" : "No";
        int experiment4 = (d > 15) ? 15 : 5;


        System.out.println("Experiment 3, :" + experiment3);
        System.out.println("Experiment 4 " + experiment4);
        System.out.println(y + " Year, " + m + " Month, " + d + " Day, isIn Range = " + isDateInRange);
        System.out.println(experiment1);
        System.out.println(experiment2);


        boolean experiment5 = true || false && false;
        System.out.println("Experiment5 " + experiment5);

    }
}

