class Times{
	int hours;
	int min;
	public int getHours() {
		return hours;
	}
	public int getMin() {
		return min;
	}
	public void set(int hrs,int mins) {
		hours=hrs;
		min=mins;
	}
	public void display() {
		if(min>10)
		System.out.println("TIME: "+this.hours+":"+this.min);
		else
		System.out.println("TIME: "+this.hours+":0"+this.min);
	}
	public static Times sum(Times t1,Times t2) {
		Times t3=new Times();
		int hrs=t1.hours+t2.hours;
		int mins=t1.min+t2.min;
		if(hrs>12) {
			hrs=hrs-12;
		}
		if(mins>60) {
			hrs++;
			mins=mins-60;
		}
		t3.set(hrs, mins);
	return t3;
	}
}
public class Time {

	public static void main(String[] args) {
		Times t1=new Times();
		t1.set(6,45);
		t1.display();
		Times t2=new Times();
		t2.set(7,55);
		t2.display();
		Times t3=Times.sum(t1, t2);
		t3.display();
		

	}

}
