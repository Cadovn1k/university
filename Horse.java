package laba12;

import java.util.Scanner;

public class Horse extends Car {
	static Scanner inp;
	private double age;
	private String suit;

	public Horse() {
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setBoost() {

	}

	@Override
	public void addms() {
		if (getMs() < getMaxms()) {
			setMs(getMs() + getBoost());
			System.out.println("Э-ге-гей");
		} else
			System.out.println("Быстрее нельзя");
	}

	@Override
	public void reducems() {
		if (getMs() != 0) {
			setMs(getMs() - getBoost());
			if (getMs() < 0)
				setMs(0);
			System.out.println("Тпру-у-уу");
		} else
			System.out.println("Итак уже стоим");
	}

	@Override
	public void begin() {
		if (getMs() == 0) {
			System.out.println("Но-о-оо");
			setMs(5);
		}
	}

	@Override
	public void end() {
		if (getMs() != 0) {
			System.out.println("Тпру-у-уу");
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
		System.out.println("Введите возраст лошади : ");
		setAge(inp.nextDouble());
		System.out.println("Введите масть лошади : ");
		setSuit(inp.next());
	}

	@Override
	public void write() {
		System.out.println("Возраст лошади = " + getAge() + ", мась лошади : " + getSuit());
	}
}