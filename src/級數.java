//檔名:級數.java
//說明:一個抽象的級數類別
public abstract class 級數 {
  protected int 現值;    //儲存級數目前的值
  protected int 首項;    //儲存級數首項的值
  級數() {   //預設(無參數的)建構方法
    首項=0;
  }
  protected int 回到首項() {
    現值=首項;
    return 現值;
  }
  protected abstract int 到次一項();
  //方法 到次一項() 宣告為abstract，因此只有宣告部分而已  
  //其作用為計算次一項之值並存入現值之後，傳回新存入的現值
  				      
  public void 印出級數(int 項數) {
    System.out.print(回到首項()+" ");
    for (int i=1; i< 項數; i++)
      System.out.print(到次一項() + " ");
    System.out.println();
  } //方法:印出級數() 定義區塊結束
} //類別:級數 定義區塊結束
