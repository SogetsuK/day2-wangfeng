import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		boolean wrong = true; // flag を立つ、判断で使う
		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		while(wrong) {                            //判断に入る。パスワードが間違った場合がループ発生
			Scanner s1 = new Scanner(System.in);
			int i = 0;                           // 変数iを初期化
			try {
				i = s1.nextInt();                // iに標準入力の値を与え
			}catch(Exception e) {               //  例外処理——————入力した内容はint型じゃない場合の対応
				System.out.println("\r" + "ILLEGAL CHARACTER! TRY AGAIN!");
				System.out.print("ENTER YOUR PIN:");
				continue;                       // ループの最初に戻り
			}                                   // 例外が発生しない場合には、catch部分がパス
			if(i == 12345){                     // パスワードが正確な場合
				wrong = false;                  // バスワードwrongがfalse
				System.out.println("\r" + "PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
				break;                         // ループ終わり
			}
			System.out.println("\r" + "INCORRECT PIN. TRY AGAIN."); //パスワードが間違った場合の対応
			System.out.print("ENTER YOUR PIN:");                    //出力終わってから、ループの最初に戻り
		}
	}
}