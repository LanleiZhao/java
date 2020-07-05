package day10.BoyGirl;

public class Girl {

    private String name;
    private int age;

    // 构造器
    public Girl(){

    }

    public Girl(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age =age;
    }
    public int getAge(){
        return this.age;
    }

    public void marry(Boy boy){
        System.out.println(this.name + "wants to marry " + boy.getName());
    }

    public void compare(Girl girl){
        int compare =  this.age - girl.getAge();
        if (compare>0){
            System.out.println(this.getName() + "比" + girl.getName()+"大"+ Math.abs(compare)+"岁！");
        } else if (compare<0){
            System.out.println(girl.getName() + "比" +this.getName()+"大"+Math.abs(compare)+"岁！");
        } else {
            System.out.println(this.getName() + "和" + girl.getName() + "一样大！");
        }

    }
}
