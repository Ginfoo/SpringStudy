package party.infoo.spring.DAO.jdbc.dao;

import party.infoo.spring.DAO.jdbc.entity.Student;

import java.util.List;

/**
 * Created by infoo on 2017/2/18.
 */
public interface StudentDao {
    public abstract int addStudent(Student student);

    public abstract int updateStudent(Student student);

    public abstract int deleteStudent(int id);

    public abstract List<Student> findAllStudents();
}
