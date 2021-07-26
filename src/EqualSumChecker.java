public class EqualSumChecker {

    public static boolean hasEqualSum(int one,int two,int three) {
        int sum = one + two;
        if(sum == three) {
            System.out.println("one "+one +" two + "+two+" = "+sum +"same as sum value in three = "+sum+" == "+ three);
            return true;
        }else {
            System.out.println("not equal to sum " +sum+" and three "+three);
            return false;
        }
    }
}
