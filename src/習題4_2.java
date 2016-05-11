//檔名:習題4_2.java
//說明:雙層巢式for迴圈測試
public class 習題4_2{
  public static void main(String[] 參數){
    int i,j,s=0;
    for(i=1;i<=5;++i)
      for(j=1;j<=i;++j)
        s+=j;
    System.out.println(s);
  } //方法:main() 定義區塊結束
} //類別: 習題4_2 定義區塊結束
