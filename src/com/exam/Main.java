package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SwingConstants;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {
	List<Menu> menu = new ArrayList<>();

	public void readMenu() {
		 while(true){
			try {
				FileReader fr;
				fr = new FileReader("menu.txt");
				BufferedReader in = new BufferedReader(fr);
				String line;
				List<Integer> id = new ArrayList<>();
				List<String> name = new ArrayList<>();
				List<Integer> price = new ArrayList<>();
				List<Integer> kcal = new ArrayList<>();
				List<Integer> order = new ArrayList<>();
				try {
					for (int i = 0; i < 7; i++) {
						line = in.readLine();
						String[] tokens = line.split(",");
						id.add(Integer.parseInt(tokens[0]));
						name.add(tokens[1]);
						price.add(Integer.parseInt(tokens[2]));
						kcal.add(Integer.parseInt(tokens[3]));
						System.out.println(id.get(i) + ") " + name.get(i));
					}
					line = in.readLine();
					print();
					System.out.println("請輸入餐點:");
					Scanner scanner = new Scanner(System.in);
					String de = scanner.nextLine();
					int d = Integer.parseInt(de);
					order.add(d);
					System.out.println("請輸入數量:");
					String many = scanner.nextLine();
					int m = Integer.parseInt(many);
					System.out.println("目前餐點:");
					
				for (int i = 0; i < order.size(); i++) {
					System.out.print((i+1)+".");
					switch (order.get(i)) {
					case 1:
						System.out.print(name.get(0));
						break;
					case 2:
						System.out.print(name.get(1));
						break;
					case 3:
						System.out.print(name.get(2));
						break;
					case 4:
						System.out.print(name.get(3));
						break;
					case 5:
						System.out.print(name.get(4));
						break;
					case 6:
						System.out.print(name.get(5));
						break;
					case 7:
						System.out.print(name.get(6));
						break;
					case 8:
						System.out.print("結算");
						break;
					default:
						break;
					}}
					System.out.println("\t"+m + "份");
					System.out.println("=================");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void print() {

		System.out.println("0) 結算");
		System.out.println("q) 離開(結束程式)");

	}

	public static void main(String[] args) {
		Main main = new Main();
		main.readMenu();

	}

}
