//檔名:習題解答4_3.java
//說明:輸入一個整數n，並計算1!+2!+3!+…+n!之值
import javax.swing.JOptionPane; //引入JOptionPane類別
public class 習題解答4_3 {
  public static void main (String[] 參數){
    String 字串;    //用於儲存使用者輸入的字串
    int n;          //用於儲存整數n
    字串=JOptionPane.showInputDialog("輸入一個整數");
    n=Integer.parseInt(字串);
    double 總和=0;
    for(double 浮點數=1,階乘值=1; 浮點數<=n; 浮點數+=1, 階乘值*=浮點數)
      總和+=階乘值;
    String 顯示字串="1!+2!+3!+…+n!(n="+n+")之值為:"+總和;
    JOptionPane.showMessageDialog(null,顯示字串);
    System.exit(0);
  } //方法:main() 定義區塊結束
} //類別: 習題解答4_3 定義區塊結束
