package sample.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.repositories.EntityRepository;
import sample.repositories.JdbcRepository;

import sample.repositories.JdbcTableRepository;

@CrossOrigin
@RestController
class MyController {

    @Autowired
    EntityRepository jpa;
    
    @Autowired
    JdbcRepository jdbc;
    
    @Autowired
    JdbcTableRepository jdbcTable;

    @GetMapping("/jpa")
    public List jpa() {
        return jpa.findAll();
    }

    @GetMapping("/jdbc")
    public List jdbc() throws SQLException {
        return jdbc.getAllFilms();
    }

    @GetMapping("/jdbcTable")
    public List jdbcTable() throws SQLException {
        return jdbcTable.getAllFilms();
    }
}
