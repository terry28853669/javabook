//檔名: 長方形.java
//說明: 定義一個實作「多邊形」介面的「長方形」類別
class 長方形 implements 多邊形{
  double 長,寬;
  長方形(double 長參數,double 寬參數){
    長=長參數;
    寬=寬參數;
  }
  public double 面積(){return 長*寬;}
  public double 週長(){return (長+寬)*2;}
} //類別:長方形 定義區塊結束
