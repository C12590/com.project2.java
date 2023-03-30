public class PersonTest {
    public static void main(String[] args){
        //创建person类对象
        Person p1 = new Person();
        //调用对象的结构；属性，方法
        //调用属性：“对象.属性”
        p1.name = "Tom";
        p1.age = 8;
        p1.isMale = true;
        System.out.println(p1.age);
        //调用方法：“对象.方法”
        p1.eat();
        p1.sleep();
        p1.talk("中文");
    }
}
