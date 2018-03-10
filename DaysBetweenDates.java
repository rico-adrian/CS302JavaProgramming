/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysbetweendates;

/**
 *
 * @author cs312004_22
 */
public class DaysBetweenDates {

    public int result(int todayDate, int todayMonth,int todayYear, int birthday, int birthdayMonth,int year) {
        //calculate the number of days between dates
        int daysBetweenDates = ((todayMonth - birthdayMonth) * 30) +((todayYear-year)*365)+ (todayDate-birthday);
        return daysBetweenDates; // return the number of days between dates
        
    }
}
