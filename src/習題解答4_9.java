//�ɦW:���D�ѵ�4_9.java
//����: ��J10�Ӿ�ơA�N���x�s��}�C���A�åH�ۤϪ����ǦL�X
import javax.swing.JOptionPane; //�ޤJJOptionPane���O
public class ���D�ѵ�4_9 {
  public static void main (String[] �Ѽ�){
    String �r��;             //�Ω��x�s�ϥΪ̿�J���r��
    int[] �}�C=new int[10];  //�Ω��x�s10�Ӿ��
    for(int i=0;i<10;++i) {
      �r��=JOptionPane.showInputDialog("��J��"+(i+1)+"�Ӿ��");
      �}�C[i]=Integer.parseInt(�r��);
    }
    for(int i=9;i>=0;--i)
      System.out.print(�}�C[i]+"|");
  } //��k:main() �w�q�϶�����
} //���O:���D�ѵ�4_9 �w�q�϶�����
