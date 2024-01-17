
package studentmanage;
import View.StudentView;

public class StudentManage {

    public static void main(String[] args) {
        String[] choice = {"Create","Find and Sort","Update/Delete","Report","Exit"};
        new StudentView().run();
    }
}
