//檔名:九九乘法表.java
//說明:列印九九乘法表
public class 九九乘法表 {
  public static void main(String[] 參數) {
    String 空白;
    for(int i=1;i<=9;++i){
      for(int j=1;j<=9;++j) {
        int k=i*j;
        if(k>=10) 空白=" "; else 空白="  ";
        System.out.print(空白+(i*j));
      } //敘述:for 區塊結束
      System.out.println();
    } //敘述:for 區塊結束  
  } //方法:main() 定義區塊結束
} //類別:九九乘法表 定義區塊結束