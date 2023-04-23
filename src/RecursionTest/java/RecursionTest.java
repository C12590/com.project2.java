package RecursionTest.java;

public class RecursionTest {
    public static void main(String[] args){
        int sum = 0;
        //计算1-100之间所有自然数之和
        for(int i = 1;i <= 100;i++){
            sum += i;
        }
        System.out.println(sum);
        //方式2
        RecursionTest test = new RecursionTest();
        int sum1 = test.getsum(100);
        System.out.println(sum1);
    }
    public int getsum(int n) {
        if(n == 1){
            return 1;
        }else{
            return n + getsum(n -1);
        }
    }
}
