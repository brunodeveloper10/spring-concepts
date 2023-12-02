package br.com.noah.scan;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import br.com.noah.scan.ScanJdbcConnection;


@Component
public class ComponentPersonDao {

    @Autowired
    private ScanJdbcConnection jdbcConnection;

    public void setjdbcConnection(ScanJdbcConnection jdbcConnection){
        this.jdbcConnection = jdbcConnection;
    }

    public ScanJdbcConnection getJdbcConnection(){
        return this.jdbcConnection;
    }
}
