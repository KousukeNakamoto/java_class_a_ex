package ex1;

import java.util.ArrayList;
import java.util.Scanner;

import ex1.User.User;

public class Main {
	public static void main(String args[]) {
		ArrayList<User> array = new ArrayList();

		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println("登録:       1");
			System.out.println("結果確認:   2");
			System.out.println("結果の登録: 3");
			System.out.println("終了:       4");

			if (scanner.hasNextLine()) {
				int input = scanner.nextInt();
				if (input == 4)
					break;

				switch (input) {
				case 1:
					//                  受験登録機能
					System.out.println("名前を入力してください");
					scanner.nextLine();
					String userName = scanner.nextLine();
					User user = new User(userName);
					array.add(user);

					System.out.println("登録が完了しました");
					System.out.println("あなたの受験番号は " + user.getTestId() + " です");
					System.out.println();
					break;
				case 2:
					//					受験結果確認機能
					System.out.println("受験番号を入力してください");
					int id = scanner.nextInt();
					System.out.println(id);
					for (User data : array) {
						if (data.getTestId() == id) {
							data.getTestData();
						} else {
							System.out.println("該当なし");
						}
					}
					break;
				case 3:
					//					テスト結果登録機
					System.out.println("パスワードを入力してください: ");
					int pass = scanner.nextInt();
					if (pass == 1111) {
						System.out.println("受験番号を入力してください");
						int id1 = scanner.nextInt();
						for (User data : array) {
							if (data.getTestId() == id1) {
								data.setTestData();
							} else {
								System.out.println("該当なし");
							}
						}
					} else {
						System.out.println("パスワードが違います");
					}
					break;
				default:
					System.out.println("有効な数字を入力してください　");

				}
			}
		}
		System.out.println("end");
		scanner.close();

	}

}
