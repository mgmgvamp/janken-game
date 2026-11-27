package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		User user = new User;
		Com com = new Com();
		System.out.println("これからわたしとじゃんけんをしましょう");
	    System.out.print("選んでください。0:グー 1:チョキ 2:パー > ");
	    user.hand = new Scanner(System.in).nextInt();   
	    com.hand = new Random().nextInt(3);
	    user.printHand();
	    com.printHand();
	    judge(user, com);
	    
	}
	
	public static void printHand(int user, int com) {
		String[] hands = {"グー", "チョキ", "パー"};
		System.out.println("ユーザー:" + hands[user]);
		System.out.println("わたし:" + hands[com]);
	}
	
	public static void judge(int user, int com) {
		if (user == com) {
			System.out.println("あいこです");
		} else if ((user + 1) % 3 == com) {
			System.out.println("ユーザーの勝ち");
		} else {
			System.out.println("わたしの勝ち");
		}
	}
}
