package cn.spring.demo;

public class SpringDemo {

    //定义变量
    private String who;

    //定义打印方法，测试
    public void print(){
        System.out.println("hello!" + this.getWho() + "!");
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
