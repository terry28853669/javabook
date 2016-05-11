//檔名:習題4_5.java
//說明:for及while迴圈綜合測試
public class 習題4_5{
  public static void main(String[] 參數){
    int i,j,s=0;
    for(i=1;i<=3;++i) {
      j=3;
      while (j<5) {
        s=s+j;
        j++;
      }
    }
    System.out.println(s);
  } //方法:main() 定義區塊結束
} //類別: 習題4_5 定義區塊結束
