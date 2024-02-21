
package Model;

import java.util.Date;

public class Worker{

    public String Id;
    public String name;
    public int age;
    public int salary;
    public String workLocation;
    public String status;
    public Date date;

    public Worker() {
    }

    public Worker(String Id, String name, int age, int salary, String workLocation) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }
    
    public Worker(String Id, String name, int age, int salary, String workLocation, String status, Date date) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.status = status ;
        this.date = date;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Worker{" + "Id=" + Id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", workLocation=" + workLocation + ", status=" + status + ", date=" + date + '}';
    }
  
}
