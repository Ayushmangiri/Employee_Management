package com.example.employeemanagement.Model;

public class Employee {

    private String name;
    private String Position ;
     public Employee (String name,String position){
         this.name = name;
         this.Position=position;

     }

     public String getName(){
         return name;

     }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getPosition() {
        return Position;
    }
}
