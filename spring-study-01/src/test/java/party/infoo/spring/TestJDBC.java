package party.infoo.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import party.infoo.spring.DAO.jdbc.entity.Student;
import party.infoo.spring.DAO.jdbc.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by infoo on 2017/2/18.
 */
public class TestJDBC {
    private ApplicationContext applicationContext;

    @Before
    public void getApplicationContext() {
        if (applicationContext == null) {
            applicationContext = new ClassPathXmlApplicationContext("JDBC.xml");
        }
    }

    @Test
    public void addStudet() {
        Student student = new Student("王五3", 12);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        int i = studentService.addStudent(student);
        if (i > 0) {
            System.out.println("添加成功");
        }
    }

    @Test
    public void updateStudent() {
        Student student = new Student();
        student.setId(1);
        student.setName("王五");
        student.setAge(14);
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        int i = studentService.updateStudent(student);
        if (i > 0) {
            System.out.println("修改成功");
        }
    }

    @Test
    public void deleteStudent() {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        int i = studentService.deleteStudent(1);
        if (i > 0) {
            System.out.println("删除成功");
        }
    }

    @Test
    public void testFindAllStudents() {
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
        List<Student> students = (ArrayList<Student>) studentService.findAllStudents();
        for(Student s:students){
            System.out.println(s);
        }
    }
}
