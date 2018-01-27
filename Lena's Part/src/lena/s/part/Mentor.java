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
public class Mentor extends Person {
    
    private String position;
    private String company;
    private double yearsOfExperience;
    
    public Mentor(String name, int age, String techInterest, String location, String lookingFor, String position, String company, double years) {
        super(name, age, techInterest, location, lookingFor);
        setPosition(position);
        setCompany(company);
        setYearsOfExperience(years);
                
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
  
    
}
