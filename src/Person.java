public class Person {

    //属性
    String name;
    /**
     * age最终值是使用对象调用所赋的值
     */
    int age = 5;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("人可以干饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话，使用的语言是:" + language);
    }
}
