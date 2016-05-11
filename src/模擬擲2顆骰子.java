//說明:模擬投擲二顆骰子10000次，並統計二顆骰子總count出現的次數
import javax.swing.JOptionPane;

public class 模擬擲2顆骰子 {
	public static void main(String[] 參數) {
		int count;
		int[] counter = new int[13];
		String msg;
		for (int i = 1; i <= 10000; i++) {
			count = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
			counter[count] += 1;
		} // 敘述:for 區塊結束
		msg = "擲二顆骰子10000次，統計\n";
		for (count = 2; count <= 12; count++)
			msg += "\n " + (count >= 10 ? " " : "  ") + count + "     " + counter[count];
		JOptionPane.showMessageDialog(null, msg);
	} // 方法:main() 定義區塊結束
} // 類別:習題解答4_5 定義區塊結束
