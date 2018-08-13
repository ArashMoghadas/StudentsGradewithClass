package com.example.asus.studentsgradewithclass;

public class Students {
    public String name;
    public String address;
    public int grade;

    public String setName(String name){
        if (name.equals("")){
            name = "Please Insert Student Name!";
        }
        return this.name = name;
    }

    public String setAddress(String address){
        if (address.equals("")){
            address = "Please Insert Student Address!";
        }
        return this.address = address;
    }

    public void setGrade(int grade){
        if (grade < 0){
            grade = 0;
            return;
        }
        if (grade > 20){
            grade = 0;
            return;
        }
        this.grade = grade;
    }

    public String evaluate(){
        if (grade < 10){
            return "Failed, you're fucked up Kid!!!";
        }
        if (grade <= 17){
            return "Passed, But not perfect!";
        }
        if (grade <= 20){
            return "Excellent, You're an Ace!!!";
        }
        return evaluate();
    }

    public String getevaluation(){
        String evalutaion = "";
        evalutaion += name + "\n";
        evalutaion += address + "\n";
        evalutaion += grade + "\n";
        evalutaion += evaluate() + "\n\n";
        return evalutaion;
    }

}
