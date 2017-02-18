package party.infoo.spring.DAO.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import party.infoo.spring.DAO.jdbc.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by infoo on 2017/2/18.
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addStudent(Student student) {
        String sql = "insert into t_student values(null,?,?)";
        Object[] params = new Object[]{student.getName(), student.getAge()};
        return jdbcTemplate.update(sql, params);
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update t_student set userName=?,userAge=? where id=?";
        Object[] params = new Object[]{student.getName(), student.getAge(), student.getId()};
        return jdbcTemplate.update(sql, params);
    }

    @Override
    public int deleteStudent(int id) {
        String sql = "delete from t_student where id=?";
        Object[] params = new Object[]{id};
        return jdbcTemplate.update(sql, params);
    }

    @Override
    public List<Student> findAllStudents() {
        String sql = "select * from t_student";
        List<Student> students = new ArrayList<>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("userName"));
                student.setAge(rs.getInt("userAge"));
                students.add(student);
            }
        });
        return students;
    }
}
