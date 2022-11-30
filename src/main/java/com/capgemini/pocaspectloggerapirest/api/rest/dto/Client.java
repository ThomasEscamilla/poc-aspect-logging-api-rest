package com.capgemini.pocaspectloggerapirest.api.rest.dto;

public class Client {
    
    private long id;
    private String name;
    private String mail;


    public Client() {
        this.id = -1L;
        this.name = "";
        this.mail = "example@example.com";
    }

    public Client(long id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", mail=" + mail + "]";
    }

    

    
}
