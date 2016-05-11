//檔名:腳踏車資訊隱藏測試.java
//說明:藉由速度不公開腳踏車類別來說明資訊隱藏特性
class 速度不公開腳踏車類別 {
   double 速度;
   速度不公開腳踏車類別() {速度=20.0;}
   void 顯示速度(){System.out.println(速度);}
}  //類別:速度不公開腳踏車類別 定義區塊結束
public class 腳踏車資訊隱藏測試 {
  public static void main (String[] 參數){
    速度不公開腳踏車類別 腳踏車1=new 速度不公開腳踏車類別();
    腳踏車1.顯示速度();
    System.out.println(腳踏車1.速度);
  } //方法:main() 定義區塊結束
} //類別:腳踏車資訊隱藏測試 定義區塊結束
