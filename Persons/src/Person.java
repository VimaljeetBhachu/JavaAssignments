import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String name;
	private findDate dob;
	
	class findDate {
		private int date;
		private int month;
		private int year;
		
		public findDate(int date, int month, int year) {
			super();
			this.date = date;
			this.month = month;
			this.year = year;
		}

		public int getDate() {
			return date;
		}

		public int getMonth() {
			return month;
		}

		public int getYear() {
			return year;
		}
	}
	
	public String getName() {
		return name;
	}

	public findDate getDob() {
		return dob;
	}

	public Person(String name, int date, int month, int year) {
		super();
		this.name = name;
		this.dob = new findDate(date,month,year);
	}
	
	public void display() {
		try {
		System.out.println("Name: "+getName());
		System.out.println("Date of Birth: "+getDob().getDate()+"/"+getDob().getMonth()+"/"+ getDob().getYear());
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(getDob().getYear(), getDob().getMonth(), getDob().getDate());
		Period p= Period.between(birthday, today);	
		
		System.out.println(p.getYears() +" Years, "+ p.getMonths() + " Months, " + p.getDays() + " Days ");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public String olderOne(Person p) {
		
		try {
		LocalDate birthday1 = LocalDate.of(this.getDob().getYear(), this.getDob().getMonth(), this.getDob().getDate());
		LocalDate birthday2 = LocalDate.of(p.getDob().getYear(), p.getDob().getMonth(), p.getDob().getDate());
		Period period= Period.between(birthday1, birthday2);
		
		
		if(this.getDob().getYear() > p.getDob().getYear()) {
			return (p.getName() + " is older than " + this.getName() + " by "+ period.getYears() + " Years, "+ period.getMonths() + " Months, " + period.getDays() + " Days").toString();
		}
		else if(this.getDob().getYear() < p.getDob().getYear()) {
			return (this.getName() + " is older than " + p.getName() + " by " + period.getYears() + " Years, " + period.getMonths() + " Months, " + period.getDays() + " Days").toString();
		}
		else {
			if(this.getDob().getMonth() > p.getDob().getMonth()) {
				return (p.getName() + " is older than " + this.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
			}
			else if(this.getDob().getMonth() < p.getDob().getMonth()) {
				return (this.getName() + " is older than " + p.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
			}
			else {
				if(this.getDob().getDate() > p.getDob().getDate()) {
					return (p.getName() + " is older than " + this.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
				}
				else if(this.getDob().getDate() < p.getDob().getDate()) {
					return (this.getName() + " is older than " + p.getName() + " by "+ period.getYears()+ " years,"+ period.getMonths() + " months,"+ period.getDays() +" days").toString();
				}
				else {
					return "Both have equal ages..!!";
				}
			}
		}
		} catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
}

