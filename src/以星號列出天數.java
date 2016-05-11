//檔名:以星號列出天數.java
//說明:以星號列出公元2000年每月天數
class 以星號列出天數 {
  public static void main(String[] 參數) {
    int[] Array1={31,29,31,30,31,30,31,31,30,31,30,31};
    for (int i=0;i<=11;++i){
      for (int j=0;j<=Array1[i];++j)
        System.out.print("*");
      System.out.println();
    } //敘述:for 區塊結束
  } //方法:main() 定義區塊結束
} //類別:以星號列出天數 定義區塊結束