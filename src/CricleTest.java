public class CricleTest {
    public static void main(String[] args){
        Cricle c1 = new Cricle();
        c1.radius=3.3;
        //对应方式一：
        //double area = c1.findArea();
        //System.out.print(area);

        //对应方式二：
        c1.findArea();
    }
}
    class Cricle{
        //属性
        double radius;
        //求圆的面积，对应方式一：
        //public double findArea(){
        //double area = Math.PI * radius * radius;
        //return area;

        //求圆的面积，对应方式二：
        public void findArea(){
            double area = Math.PI * radius * radius;
            System.out.println("圆的面积是：" + area);
        }
    }