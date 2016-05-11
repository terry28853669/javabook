//檔名:習題4_6.java
//說明:for迴圈及陣列綜合測試
public class 習題4_6{
  public static void main(String[] 參數){
    int[][] a=new int[5][5];
    for(int i=1;i<5;++i)
      for(int j=0;j<5;++j)
        a[i][j]=i+j;
    System.out.println(a[3][1]);
    System.out.println(a[a[1][1]][a[2][2]]);
  } //方法:main() 定義區塊結束
} //類別: 習題4_6 定義區塊結束
