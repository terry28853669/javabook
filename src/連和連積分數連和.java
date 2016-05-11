//檔名:連和連積分數連和.java
//說明:輸入一整數n，並計算1+2+…+n(連和)，及1*2*…*n(連積)
//及(1/1)+(1/2)+…+(1/n)(分數連和)之值
import javax.swing.JOptionPane;

public class 連和連積分數連和 {
	public static void main(String[] 參數) {
		int n; // 用於儲存使用者輸入之整數
		int 連和 = 0; // 用於儲存1+2+…之累加值
		double 連積 = 1.0; // 用於儲存1*2*…之累乘值
		double 分數連和 = 0.0;// 用於儲存1(1/1)+(1/2)+…之累加值
		String 輸入字串 = JOptionPane.showInputDialog("請輸入一正整數");
		n = Integer.parseInt(輸入字串);
		for (int i = 1; i <= n; ++i) { // for迴圈敘述中i之值為1,2,…,n
			連和 += i; // 將i之值累加至連和中
			連積 *= i; // 將i之值累乘至連積中
			分數連和 += (1.0 / i); // 將(1/i)之值累加至分數連和中
		}
		String 顯示字串 = "你輸入的正整數為" + n;
		顯示字串 = 顯示字串 + "\n1到" + n + "的連和為" + 連和;
		顯示字串 = 顯示字串 + "\n1到" + n + "的連積為" + 連積;
		顯示字串 = 顯示字串 + "\n1到" + n + "的分數連和為" + 分數連和;
		JOptionPane.showMessageDialog(null, 顯示字串);
		System.exit(0);
	} // 方法:main() 定義區塊結束
} // 類別:連和連積分數連和 定義區塊結束
