//�ɦW:���D4_6.java
//����:for�j��ΰ}�C��X����
public class ���D4_6{
  public static void main(String[] �Ѽ�){
    int[][] a=new int[5][5];
    for(int i=1;i<5;++i)
      for(int j=0;j<5;++j)
        a[i][j]=i+j;
    System.out.println(a[3][1]);
    System.out.println(a[a[1][1]][a[2][2]]);
  } //��k:main() �w�q�϶�����
} //���O: ���D4_6 �w�q�϶�����
