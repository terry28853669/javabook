//檔名: 腳踏車類別.java
//說明：一個定義類別「腳踏車類別」的例子
class 腳踏車類別 {
  double 速度;
  腳踏車類別() {速度=20.0;}
  腳踏車類別(double 參數) {速度=參數;}
  double 加速(){速度*=1.1; return 速度;}
  double 減速(){速度*=0.9; return 速度;}
  double 停車(){速度=0.0; return 速度;}
  void 顯示速度(){System.out.println(速度);}
} //類別:腳踏車類別 定義區塊結束
