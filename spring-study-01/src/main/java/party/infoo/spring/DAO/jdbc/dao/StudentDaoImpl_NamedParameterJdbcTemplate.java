package party.infoo.spring.DAO.jdbc.dao;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import party.infoo.spring.DAO.jdbc.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by infoo on 2017/2/19.
 */
public class StudentDaoImpl_NamedParameterJdbcTemplate implements StudentDao {
    private NamedParameterJdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addStudent(Student student) {
        String sql = "insert into t_student values(null,:name,:age)";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("name", student.getName());
        mapSqlParameterSource.addValue("age", student.getAge());
        return jdbcTemplate.update(sql, mapSqlParameterSource);
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "update t_student set userName=:name,userAge=:age where id=:id";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("name", student.getName());
        mapSqlParameterSource.addValue("age", student.getAge());
        mapSqlParameterSource.addValue("id", student.getId());
        return jdbcTemplate.update(sql, mapSqlParameterSource);
    }

    @Override
    public int deleteStudent(int id) {
        String sql = "delete from t_student where id=:id";
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id", id);
        return jdbcTemplate.update(sql, mapSqlParameterSource);
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
