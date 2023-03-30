public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
        int area = test.method(9,8);
        System.out.println("面积为：" + area);
    }

    public int method(int m,int n) {
//        for(int i = 0; i < 10;i++){
//            for(int j = 0; j < 8;j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            return m * n;
    }
}