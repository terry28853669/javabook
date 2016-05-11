//檔名:習題4_9.java
//說明:雙層for迴圈綜合測試
public class 習題4_9{
  public static void main(String[] 參數){
    int s=0;
    for(int i=1;i<=10;++i) {
      s++;
      for(int j=1;j<=4;++j)
        s+=2;
    } 
    System.out.println(s);
  } //方法:main() 定義區塊結束
} //類別: 習題4_9 定義區塊結束
