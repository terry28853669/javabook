//檔名:習題解答4_4.java
//說明:1000cc的水每天漏掉一半，求出第幾天水量少於50cc？
import javax.swing.JOptionPane; //引入JOptionPane類別
public class 習題解答4_4 {
  public static void main (String[] 參數){
    double 水量=1000;
    int 天數=1;
    while(水量>=50) {
      水量/=2; 
      天數++;
    }
    String 顯示字串="第"+天數+"時之水量為"+水量+"cc，已少於50cc";
    JOptionPane.showMessageDialog(null,顯示字串);
    System.exit(0);
  } //方法:main() 定義區塊結束
} //類別: 習題解答4_4 定義區塊結束
