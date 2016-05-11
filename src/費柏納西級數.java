//檔名:費柏納西級數.java
//說明:費柏納西級數(繼承自abstract類別 級數)
class 費柏納西級數 extends 級數 {
  protected int 次項,前項;
  費柏納西級數() {   //預設(無參數)的建構方法
    首項=0; 
    次項=1;
    前項=次項-首項;
  }
  protected int 回到首項() {
    現值=首項;
    前項=次項-首項;
    return 現值;
  }
  protected int 到次一項() {
    int 暫存值=前項;
    前項=現值;
    現值=現值+暫存值;
    return 現值;
  }
} //類別:費柏納西級數 定義區塊結束
