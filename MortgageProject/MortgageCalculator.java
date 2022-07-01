import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {

	public static double computeMaxMortgage(int yearOfBirt, int month, int day, double monthlyIncome, boolean married,
			double monthlyIncomePartner, String profession) {
		double totalIncome = monthlyIncome + monthlyIncomePartner * 0.94;
		if (checkAge(yearOfBirt, month, day)) {
			if (2000 <= totalIncome && totalIncome < 3000) {
				if (profession.equals("Developer") || profession.equals("Architect")
						|| profession.equals("Scrum master"))
					return 160000;
				if (profession.equals("Tester") || profession.equals("System Administrator")
						|| profession.equals("Technical writer"))
					return 120000;
				if (profession.equals("Department head") || profession.equals("Professor"))
					return 220000;
			}
			if (3000 <= totalIncome && totalIncome < 5000) {
				if (profession.equals("Developer") || profession.equals("Architect")
						|| profession.equals("Scrum master"))
					return 180000;
				if (profession.equals("Tester") || profession.equals("System Administrator")
						|| profession.equals("Technical writer"))
					return 140000;
				if (profession.equals("Department head") || profession.equals("Professor"))
					return 250000;
			}
			if (5000 <= totalIncome) {
				if (profession.equals("Developer") || profession.equals("Architect")
						|| profession.equals("Scrum master"))
					return 220000;
				if (profession.equals("Tester") || profession.equals("System Administrator")
						|| profession.equals("Technical writer"))
					return 160000;
				if (profession.equals("Department head") || profession.equals("Professor"))
					return 280000;
			}
		}
		return 0;

	}

	public static boolean checkAge(int yearOfBirt, int month, int day) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(yearOfBirt, month, day);

		Period period = Period.between(birthday, today);
		int age = period.getYears();
		return age > 18 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(computeMaxMortgage(1987, 9, 11, 2500, false, 0, "Architect"));
	}
}
