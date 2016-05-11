//檔名:習題解答6_9.java
//說明:測量執行敘述 整數=3+8; 一千萬次所花的時間
public class 習題解答6_9 extends 測量方法執行時間 {
  int 整數;
  void 被測方法() {
    整數=3+8;
  }
  public static void main(String[] 參數){
    System.out.print("整數=3+8; 執行一千萬次所花的時間為:\n");
    System.out.print(new 習題解答6_9().測量時間(10000000));
    System.out.println("毫秒");
  } //方法:main() 定義區塊結束
} //類別:習題解答6_9 定義區塊結束
