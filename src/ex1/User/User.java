package ex1.User;

import java.util.Scanner;

public class User {
	private String name = null;
	private int japanese = 0;
	private int math = 0;
	private int science = 0;
	private int social = 0;
	private int english = 0;
	private int id = 0;
	private static int uid = 0;

	public User(String _name) {
		this.name = _name;
		User.uid++;
		this.id = uid;
	}

	public int getTestId() {
		return this.id;
	};

	public void setTestData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("国語: ");
		this.japanese = scanner.nextInt();

		System.out.println("数学: ");
		this.math = scanner.nextInt();

		System.out.println("理科: ");
		this.science = scanner.nextInt();

		System.out.println("社会: ");
		this.social = scanner.nextInt();

		System.out.println("英語: ");
		this.english = scanner.nextInt();
		System.out.println();
	}

	public void getTestData() {
		System.out.println("国語:" + this.japanese);
		System.out.println("数学:" + this.math);
		System.out.println("理科:" + this.science);
		System.out.println("社会:" + this.social);
		System.out.println("英語:" + this.english);
		System.out.println();
	}
}
