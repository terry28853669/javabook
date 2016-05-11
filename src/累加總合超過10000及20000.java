//檔名:累加總合超過10000及20000.java
//說明:1+2+…+n>10000，利用while敘述求n
//     1+2+…+m>20000，利用do敘述求m

public class 累加總合超過10000及20000{
  public static void main (String[] 參數){
    int i=0;		//變數i用以紀錄目前將累加的整數
    int 連和=0;   	//變數連和用以紀錄目前已累加的總和
    while (連和<=10000) 
      連和 += ++i;
    System.out.println("1+2+…+"+i+">10000");
    do 連和 += ++i;  while(連和<=20000);
    System.out.println("1+2+…+"+i+">20000");
  }//方法:main() 定義區塊結束
} //類別:累加總合超過10000及20000 定義區塊結束
