package _05_inheritance._03_mankind;


public class Worker extends Human {
    private double weekSalary;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

//    public double getWeekSalary() {
//        return weekSalary;
//    }
//
//    public int getWorkHoursPerDay() {
//        return workHoursPerDay;
//    }

    private void setWeekSalary(double weekSalary) {
        if(weekSalary <= 10){
            throw new IllegalArgumentException(String.format("Expected value mismatch!Argument: %s",weekSalary));
        }
        this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDay(int workHoursPerDay) {
        if(workHoursPerDay < 1 || workHoursPerDay > 12){
            throw new IllegalArgumentException(String.format("Expected value mismatch!Argument: %s",workHoursPerDay));
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    private double getSalaryPerHour(double weekSalary, int workingHours){
        double salaryPerHour = 0.0;
        return salaryPerHour = (weekSalary / 7.0) / (double) workingHours;
    }

    @Override
    protected void setLastName(String lastName) {
        super.setLastName(lastName);
        if(lastName.length() < 4){
            throw new IllegalArgumentException(String.format("Expected length more than 3 symbols!Argument: %s", lastName));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(getLastName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f",this.weekSalary))
                .append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f",(double)this.workHoursPerDay))
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f",getSalaryPerHour(this.weekSalary, this.workHoursPerDay)));
        return sb.toString();
    }
}
