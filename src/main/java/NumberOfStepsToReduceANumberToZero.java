public class NumberOfStepsToReduceANumberToZero{
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero n = new NumberOfStepsToReduceANumberToZero();
        System.out.println(n.numberOfSteps(14));
    }

    public int numberOfSteps (int num) {
        int ans = 0;
        while (num != 0){
            if(num %2 == 0){
                num /=2;
            }else {
                num -= 1;

            }
            ans++;
        }
        return ans;
    }
}