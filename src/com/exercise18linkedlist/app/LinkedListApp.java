package com.exercise18linkedlist.app;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
public class LinkedListApp {

	public static void main(String[] args) {
		// Tipo de dato parametrizado
		// <DataType>  -> Generics
		LinkedList <Byte> myList = new LinkedList<Byte>();
		ArrayList <Short> myArray = new ArrayList<Short>();
		Stack <Integer> myPila = new Stack<Integer>();
		// Como no es una estructura de datos que es una interfaz de el paquete collections
		//PriorytyQueue <Double> myCola = new PriorityQueue <Double>();
		// Dos tipos de datos por que es como un dicccionario
		HashMap <Integer, String> myDiccionario = new HashMap <Integer, String>();
		Random randomNumber = new Random(System.nanoTime());
		Iterator myIterator = myList.iterator();
		
		myList.add((byte) 5);
		myList.add((byte) 10);
		myList.add((byte) 20);
		myList.add((byte) 30);
		myList.add((byte) 40);
		// Print whole list
		System.out.println(myList);
		// Print an specific index of the list
		System.out.println(myList.get(3));
		// Remplace in a specific index lower than 'ArrayList'
		myList.set(0, (byte) 2);
		System.out.println(myList);
		// Remove the last one of the list
		/*
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		System.out.println(myList.remove());
		*/
		Byte number = 2;
		// Size of my list
		System.out.println(myList.size());
		// The list contains values? True / False
		System.out.println(myList.isEmpty());
		// Find an specific value in the list
		System.out.println(myList.contains(number));
		// Clean list
		myList.clear();
		// Show list
		System.out.println(myList);
		// Fill list with random numbers
		for(int i = 0; i<myList.size();i++) {
			myList.add((byte) randomNumber.nextInt(100));
		}
		System.out.println(myList);
		
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		for(Byte miNumber : myList) {
			System.out.println(miNumber);
		}
	}	
}
