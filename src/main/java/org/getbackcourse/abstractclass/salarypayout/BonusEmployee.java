package org.getbackcourse.abstractclass.salarypayout;

public class BonusEmployee implements Employee {
    int salary;
    double bonusInPercents;
    boolean isExtraSaleAchieved;

    public BonusEmployee(int salary, double bonusInPercents, boolean isExtraSaleAchieved) {
        this.salary = salary;
        this.bonusInPercents = bonusInPercents;
        this.isExtraSaleAchieved = isExtraSaleAchieved;
    }

    public double calculateSalary() {
        if (isExtraSaleAchieved) {
            return salary + (salary * bonusInPercents / 100);
        } else {
            return salary;
        }
    }
}
