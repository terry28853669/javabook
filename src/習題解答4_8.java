//檔名:習題解答4_8.java
//說明:顯示特別圖形
public class 習題解答4_8{
  public static void main(String[] 參數){
    for (int i=-4;i<=4;i+=2){ 
      for(int j=1;j<=Math.abs(i)/2;j+=1) 
	System.out.print(" "); 
      for(int j=1;j<=5-Math.abs(i);j+=1) 
	System.out.print("*"); 
      System.out.println();
    } //敘述:for 區塊結束
  } //方法:main() 定義區塊結束
} //類別:習題解答4_8 定義區塊結束
