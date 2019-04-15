package com.example.eco_eat;

public class Node{
	public static Data value;
	public static Node left;
	public static Node right;
	
	public static Node(Data d){
		this.value = d;
		this.left = null;
		this.right = null;
	}
}