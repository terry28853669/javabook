//檔名: 多邊形測試.java
//說明: 測試實作「多邊形」介面的「正方形」及「長方形」類別
public class 多邊形測試{
  public static void main(String[] 參數){
    正方形 正方形物件=new 正方形(5);
    長方形 長方形物件=new 長方形(3,6);
    System.out.println("邊長為5的正方形面積："+正方形物件.面積());
    System.out.println("邊長為5的正方形週長："+正方形物件.週長());
    System.out.println("長為3寬為6的長方形面積："+長方形物件.面積());
    System.out.println("長為3寬為6的長方形週長："+長方形物件.週長());
  } //方法:main() 定義區塊結束
} //類別:多邊形測試 定義區塊結束
