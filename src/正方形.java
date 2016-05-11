//檔名: 正方形.java
//說明: 定義一個實作「多邊形」介面的「正方形」類別
class 正方形 implements 多邊形{
  double 邊長;
  正方形(double 邊長參數){邊長=邊長參數;}
  public double 面積(){return 邊長*邊長;}
  public double 週長(){return 邊長*4;}
} //類別:正方形 定義區塊結束
