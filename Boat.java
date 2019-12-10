package laba12;

import java.util.Scanner;

public class Boat extends Car {
	static Scanner inp;

	private double oars;
	private double power;

	public Boat() {

	}

	public double getOars() {
		return oars;
	}

	public void setOars(double oars) {
		this.oars = oars;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Override
	public void begin() {
		if (getMs() == 0) {
			System.out.println("Поплыли");
			setMs(2);
		}

	}

	@Override
	public void end() {
		if (getMs() != 0) {
			System.out.println("Сушим весла. Стоим, рыбачим");
			setMs(0);
		}
	}

	@Override
	public void read() {
		inp = new Scanner(System.in);
		System.out.println("Введите текущую скорость : ");
		setMs(inp.nextDouble());
		System.out.println("Введите ускорение транспорта : ");
		setBoost(inp.nextDouble());
		System.out.println("Введите максимальную скорость : ");
		setMaxms(inp.nextDouble());
		System.out.println("Введите количетсов весел :");
		setOars(inp.nextDouble());
		System.out.println("Введите мощность мотора");
		setPower(inp.nextDouble());
	}

	@Override
	public void write() {
		System.out.print("Название : " + getName() + ", скорость = " + getMs() + ", ускорение = " + getBoost()
				+ ", количество весел = " + getOars() + ", мощность мотора = " + getPower());
	}

}
