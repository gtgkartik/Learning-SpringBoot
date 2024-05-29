package com.learingspringboot.learingspringboot;

public class Course {
    int id ;
    String coursename ;
    String author ;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getAuthor() {
        return author;
    }


    Course(int id, String coursename, String author){
        this.id = id ;
        this.coursename = coursename ;
        this.author = author;
    }
}
