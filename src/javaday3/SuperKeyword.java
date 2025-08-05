package javaday3;

class Person{
    String fname;
    String lname;

    Person(String fname,String fname ){
        this.fname=fname;
        this.lname=lname;
    }
}
class Student extends Person{
    int usn;
    Student(String fname,String lname,int usn ){
        super(fname,lname);
        this.usn=usn;
    }
}
