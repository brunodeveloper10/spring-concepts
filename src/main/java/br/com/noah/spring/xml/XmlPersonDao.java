package br.com.noah.spring.xml;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Component
public class XmlPersonDao {

    @Autowired
    private XmlJdbcConnection xmlJdbcConnection;

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection){
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public XmlJdbcConnection getXmlJdbcConnection(){
        return this.xmlJdbcConnection;
    }
}
