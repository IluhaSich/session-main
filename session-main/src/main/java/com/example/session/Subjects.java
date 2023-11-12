package com.example.session;

public class Subjects {

    String subject,data,teacher_name;

    public String getSubject() {
        return subject;
    }

    public String getData() {
        return data;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public Subjects(String subject, String data, String teacher_name) {
        this.subject = subject;
        this.data = data;
        this.teacher_name = teacher_name;
    }
}
