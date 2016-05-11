//檔名:習題解答4_9.java
//說明: 輸入10個整數，將之儲存於陣列中，並以相反的次序印出
import javax.swing.JOptionPane; //引入JOptionPane類別
public class 習題解答4_9 {
  public static void main (String[] 參數){
    String 字串;             //用於儲存使用者輸入的字串
    int[] 陣列=new int[10];  //用於儲存10個整數
    for(int i=0;i<10;++i) {
      字串=JOptionPane.showInputDialog("輸入第"+(i+1)+"個整數");
      陣列[i]=Integer.parseInt(字串);
    }
    for(int i=9;i>=0;--i)
      System.out.print(陣列[i]+"|");
  } //方法:main() 定義區塊結束
} //類別:習題解答4_9 定義區塊結束
