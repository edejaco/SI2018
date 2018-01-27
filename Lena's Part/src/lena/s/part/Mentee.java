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
public class Mentee extends Person{
    
    private double years;
    private String futureGoals;
    
    public Mentee(String name, int age, String techInterest, String location, String lookingFor, double years,  String futureGoals) {
        super(name, age, techInterest, location, lookingFor);
        setYears(years);
        setFutureGoals(futureGoals);
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public String getFutureGoals() {
        return futureGoals;
    }

    public void setFutureGoals(String futureGoals) {
        this.futureGoals = futureGoals;
    }
    
    
    
}
