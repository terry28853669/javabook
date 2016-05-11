//檔名:習題6_1.java
//說明:測試變數的使用範圍(scope)
class 類別 {
  int 整數=500;
  void 方法1() {
    int 整數=100;
    System.out.println("測試1:"+整數);
    方法2();
  }
  void 方法2() {
    System.out.println("測試2:"+整數);
  }
  void 方法3() {
    System.out.println("測試3:"+整數);
    for(int 整數=1;整數<=3;++整數) 
      System.out.println("測試4:"+整數);
    System.out.println("測試5:"+整數);
  }
} //類別:類別 定義區塊結束

class 習題6_1 {
  public static void main(String[] 參數) {
    類別 物件=new 類別();
    物件.方法1();
    物件.方法2();
    物件.方法3();
  } //方法:main() 定義區塊結束
} //類別:習題6_1 定義區塊結束
