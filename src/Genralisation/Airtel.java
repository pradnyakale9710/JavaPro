package Genralisation;

public class Airtel implements TRAI {

	@Override
	public void Call() {
		System.out.println("Airtel Call-1RS/min");
		
	}

	@Override
	public void Sms() {
		System.out.println("Airtel Sms-100sms/Day");
		
	}

	@Override
	public void Data() {
		System.out.println("Airtel Data-1gb/day");
		
	}

}
