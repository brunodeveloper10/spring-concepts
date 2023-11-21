package br.com.noah.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.noah.spring.scope.JdbcConnection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
public class PersonDao {

    @Autowired
    private JdbcConnection jdbcConnection;

    public void setjdbcConnection(JdbcConnection jdbcConnection){
        this.jdbcConnection = jdbcConnection;
    }

    public JdbcConnection getJdbcConnection(){
        return this.jdbcConnection;
    }
}
