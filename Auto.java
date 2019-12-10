package laba12;

import java.util.Scanner;

public class Auto extends Ground {
	static Scanner inp;

	private String colour;
	private String model;
	private double wheels;

	public Auto() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWheels() {
		return wheels;
	}

	public void setWheels(double wheels) {
		this.wheels = 4;
	}

	@Override
	public void begin() {
		if (getMs() == 0) {
			System.out.println("Гони шеф!");
			setMs(10);
		}
	}

	@Override
	public void end() {
		if (getMs() != 0) {
			System.out.println("Останавливаемся");
			while (getMs() > 0) {
				setMs(getMs() - 10);
				System.out.println("Тормоз");
				System.out.println(getMs());
			}
			System.out.println("Стоп. Приехали");
		}
	}

	public void addms() {
		super.addms();
	}

	public void reducems() {
		super.reducems();
	}

	@Override
	public void read() {
		inp = new Scanner(System.in);
		super.read();
		System.out.println("Введите цвет кузова :");
		setColour(inp.nextLine());
		System.out.println("Введите модель автомобиля : ");
		setModel(inp.nextLine());
		setWheels(4);
	}

	@Override
	public void write() {
		super.write();
		System.out.print(", цвет кузова : " + getColour() + ", модель автомобиля : " + getModel());
	}
}