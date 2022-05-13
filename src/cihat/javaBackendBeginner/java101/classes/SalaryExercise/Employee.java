package cihat.javaBackendBeginner.java101.classes.SalaryExercise;

/**@author Cihat Gelir*/
public class Employee {
	private String name;
	private double grossSalary;
	private int workHours;
	private int hireYear;
	
	public Employee(String name, int grossSalary, int workHours, int hireYear) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	/**Calculates and returns tax that will be applied to salary.
	 * @return tax that will be applied to salary.
	 */
	public double tax() {
		return (grossSalary <= 1000) ? 0 : grossSalary*0.03;
	}
	
	/**Calculates and returns the weekly bonus
	 * @return bonus money
	 */
	public int bonus() {
		return (workHours > 40) ? (workHours - 40)*30 : 0;
	}
	
	/**It will calculate the salary increase based on the employee's starting year. 
	 * Take the current year as 2021.
	 * 
	 */
	public double raiseSalary() {
		if (2021 - hireYear < 10) {
			return grossSalary*0.05;
		} else if (2021 - hireYear >= 10 && 2021 - hireYear < 20){
			return grossSalary*0.10;
		} else {
			return grossSalary*0.15;
		}
	}
	
	
	/**Returns total of grossSalary and raiseSalary
	 * @return totalSalary
	 */
	public double netSalary() {
		return grossSalary - tax() + bonus();
	}
	
	public double totalSalary() {
		return grossSalary + raiseSalary();
	}
	
	public String toString() {
		return 	  "Name: " + name + "\n" +
				  "Salary: " + grossSalary + "\n" +
				  "Work hours: " + workHours + "\n" + 
				  "Hire year: " + hireYear + "\n" + 
				  "Tax: " + tax() + "\n" +
				  "Bonus: " + bonus() + "\n" + 
				  "Raised Money: " + raiseSalary() + "\n" + 
				  "Net Salary: " + netSalary() + "\n" +
				  "Total Salary: " + totalSalary();
	}
	
}
