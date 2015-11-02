package main;

import kata.reverse.Reverse;


public class Main {
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverse("").toString());
	}
}