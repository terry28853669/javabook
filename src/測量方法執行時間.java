//檔名:測量方法執行時間.java
//說明:測量方法執行時間之抽象類別
abstract class 測量方法執行時間 {
  abstract void 被測方法();  //抽象之方法，僅列出宣告部分而已
  public long 測量時間(int 執行次數) {
    long 方法開始時毫秒數=System.currentTimeMillis();
    for (int i=1;i<=執行次數; ++i) 被測方法();
    long 方法停止時毫秒數=System.currentTimeMillis();
    return (方法停止時毫秒數-方法開始時毫秒數);
  } //方法:測量時間 定義區塊結束
} //類別:測量方法執行時間 定義區塊結束
