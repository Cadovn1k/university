package laba12;

import java.util.Scanner;

public abstract class Car {
	static Scanner inp;

	private String name;
	private double ms;
	private double boost;
	private double maxms;

	public Car() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMs() {
		return ms;
	}

	public void setMs(double ms) {
		this.ms = ms;
	}

	public double getBoost() {
		return boost;
	}

	public void setBoost(double boost) {
		this.boost = boost;
	}

	public double getMaxms() {
		return maxms;
	}

	public void setMaxms(double maxms) {
		this.maxms = maxms;
	}

	public void addms() {
		if (getMs() < getMaxms()) {
			setMs(getMs() + getBoost());
			System.out.println("Еще быстрее");
		} else
			System.out.println("Быстрее нельзя");
	}

	public void reducems() {
		if (getMs() != 0) {
			setMs(getMs() - getBoost());
			if (getMs() < 0)
				setMs(0);
			System.out.println("Тормозим");
		} else
			System.out.println("Итак уже стоим");
	}

	public abstract void begin();

	public abstract void end();

	public abstract void read();

	public abstract void write();
}