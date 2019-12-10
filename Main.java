package laba12;

import java.util.Scanner;

public class Main {
	static Scanner inp;

	public static void main(String[] args) {
		inp = new Scanner(System.in);
		Car[] ms = new Car[10];
		for (int i = 0; i < ms.length; i++) {
			System.out.println("Введите название транспортного средства: автомобиль, автобус, лодка или лошадь : ");
			String str = inp.nextLine();
			if (str.equalsIgnoreCase("автомобиль")) {
				ms[i] = new Auto();
				ms[i].setName(str);
			}
			if (str.equalsIgnoreCase("автобус")) {
				ms[i] = new BUS();
				ms[i].setName(str);
			}
			if (str.equalsIgnoreCase("лодка")) {
				ms[i] = new Boat();
				ms[i].setName(str);
			}
			if (str.equalsIgnoreCase("лошадь")) {
				ms[i] = new Horse();
				ms[i].setName(str);
			}
			ms[i].read();
		}
		for (int i = 0; i < ms.length; i++) {
			ms[i].begin();
			while (ms[i].getMs() < ms[i].getMaxms()) {
				ms[i].addms();
			}
			ms[i].end();
		}
	}
}
