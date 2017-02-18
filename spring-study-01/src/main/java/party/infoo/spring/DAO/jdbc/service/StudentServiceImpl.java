package party.infoo.spring.DAO.jdbc.service;

import party.infoo.spring.DAO.jdbc.dao.StudentDao;
import party.infoo.spring.DAO.jdbc.entity.Student;

import java.util.List;

/**
 * Created by infoo on 2017/2/18.
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }
}
