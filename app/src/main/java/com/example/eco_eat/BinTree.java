package com.example.eco_eat;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class BinTree{
	public static Node root;

	private static Node addRecursive(Node current, Data value){
		if (current == null){
			return new Node(value);
		}
		if (value.compare_to(current.value)){
			current.right = addRecursive(current.right, value);
		}
		else{
			current.left = addRecursive(current.left, value);
		}
		return current;
	}
	public static void add(Data value){
		root = addRecursive(root, value);
	}
	private static Data containsNodeRecursive(Node current, Data value) {
		if (current == null){
			return new Data("no result", "very", "sad");
		}
		if (value.equal_to(current.value)){
			return value;
		}
		return current.value.compare_to(value) ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
	}
	public static Data containsNode(Data value) {
	    return containsNodeRecursive(root, value);
	}
}