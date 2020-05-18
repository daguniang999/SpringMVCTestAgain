package com.chenx.repository;

import com.chenx.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.access.method.P;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.synth.SynthUI;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("userRepository")
public class userRepository {

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcOperations jdbcOperations;

    private static final String INSERT_SQL = "Insert into tb_person(name, sex, age) VALUE (?, ?, ?)";

    private static final String SELECT_BY_NAME = "select * from tb_person where name = ?";

    public void addUser(Person person) {
        jdbcOperations.update(INSERT_SQL, "cxw", "n", "13");
    }

    public void selectPerson() {
        List<Person> persons = jdbcOperations.query(SELECT_BY_NAME, new PersonMap(), "cxw");
        for (int i = 0; i < persons.size(); i ++) {
            System.out.println(persons.get(i).toString());
        }
    }

    private static final class PersonMap implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Person(
              resultSet.getString("name"),
              resultSet.getString("age"),
              resultSet.getString("sex")
            );
        }
    }
}
