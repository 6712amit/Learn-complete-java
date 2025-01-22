package com.in28minute.rest.webservices.restfull_web_services.User;

import java.sql.Date;

public class User {
private int id;
private String name;
private Date BirthDate;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public Date getBirthDate() {
    return BirthDate;
}
public void setBirthDate(Date birthDate) {
    BirthDate = birthDate;
}
public User(int id, String name, Date birthDate) {
    this.id = id;
    this.name = name;
    BirthDate = birthDate;
}
@Override
public String toString() {
    return "User [id=" + id + ", name=" + name + ", BirthDate=" + BirthDate + "]";
}


}
