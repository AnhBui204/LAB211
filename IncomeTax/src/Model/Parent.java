
package Model;

public class Parent {

    public int num; //So luong
    public int age; //Tuoi

    public Parent() {
    }

    public Parent(int num, int age) {
        this.num = num;
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Parent{" + "num=" + num + ", age=" + age + '}';
    }
}
