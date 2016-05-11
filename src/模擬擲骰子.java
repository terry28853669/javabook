//檔名:模擬擲骰子.java
//說明:模擬投擲骰子10000次，並統計各count出現的次數
import javax.swing.JOptionPane;

public class 模擬擲骰子 {
	public static void main(String[] arg) {
		int count;
		int[] counter = new int[7];
		String S;
		for (int i = 1; i <= 10000; i++) {
			count = (int) (Math.random() * 6 + 1);
			counter[count] += 1;
		} // 敘述:for 區塊結束
		S = "擲骰子10000次點數出現次數:";
		for (count = 1; count <= 6; count++)
			S += "\n  " + count + "      " + counter[count];
		JOptionPane.showMessageDialog(null, S);
	} 
}
