/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lena.s.part;

/**
 *
 * @author ekd17
 */
public class Person {
    
    private String name;
    private int age;
    private String techInterest;
    private String location;
    private String lookingFor;
    
    public Person(String name, int age, String techInterest, String location, String lookingFor){
        setName(name);
        setAge(age);
        setTechInterest(techInterest);
        setLocation(location);
        setLookingFor(lookingFor);
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTechInterest() {
        return techInterest;
    }

    public void setTechInterest(String techInterest) {
        this.techInterest = techInterest;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    
    
    
    
    
}
