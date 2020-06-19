import java.util.Scanner;

public class Trie {
	static final int ALPHA_SIZE = 26;
	
	static class Node{
		Node[] child = new Node[ALPHA_SIZE];
		boolean isWordEnd;
		Node() {
			isWordEnd = false;
			for(int i =0;i<ALPHA_SIZE;i++) {
				child[i] = null;
			}
		}
	};
	
	static Node root;
	
	static void Insert(String word) {
		int level;
		int index;
		Node crawl = root;
		for(level =0;level<word.length();level++) {
			index = word.charAt(level)-'a';
			if(crawl.child[index]==null)
			{
				crawl.child[index] = new Node();
			}
			crawl = crawl.child[index];
		}
		crawl.isWordEnd = true;
	}
	
	static boolean Search(String word) {
		int level;
		int index;
		Node crawl = root;
		for(level = 0;level<word.length();level++) {
			index = word.charAt(level)-'a';
			if(crawl.child[index]==null) return false;
			crawl = crawl.child[index];
		}
		return (crawl!=null && crawl.isWordEnd);
	}
	
	public static void main(String ...args)
	{
		String dict[]= {"hello","hi","namaste","ciao","hola","bonjour","kemcho","hallo","oi"};
		root = new Node();
		for(int i =0;i<dict.length;i++)
		{
			Insert(dict[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word in lower case:");
		if(Search(sc.nextLine())) {
			System.out.println("Word present");
		}
		else {
			System.out.println("Word not present");
		}	
		sc.close();
	}
}
