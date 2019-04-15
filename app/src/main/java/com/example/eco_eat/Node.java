package com.example.eco_eat;

public class Node{
	public static Data value;
	public static Node left;
	public static Node right;
	
	public Node(Data d){
		this.value = d;
		left = null;
		right = null;
	}
}