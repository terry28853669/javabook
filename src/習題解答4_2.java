//�ɦW:���D�ѵ�4_2.java
//����:��J�@�Ӿ��n�A�íp��1-1/2+1/3-1/4+�K+1/n����
import javax.swing.JOptionPane; //�ޤJJOptionPane���O
public class ���D�ѵ�4_2 {
  public static void main (String[] �Ѽ�){
    String �r��;    //�Ω��x�s�ϥΪ̿�J���r��
    int n;          //�Ω��x�s���n
    �r��=JOptionPane.showInputDialog("��J�@�Ӿ��");
    n=Integer.parseInt(�r��);
    double �`�M=0;
    for(double �B�I��=1,���t��=1; �B�I��<=n; �B�I��+=1, ���t��*=-1) 
      �`�M+=(1/�B�I��)* ���t��;
    String ��ܦr��="1-1/2+1/3-1/4+�K+1/n(n="+n+")���Ȭ�:"+�`�M;
    JOptionPane.showMessageDialog(null,��ܦr��);
    System.exit(0);
  } //��k:main() �w�q�϶�����
} //���O: ���D�ѵ�4_2 �w�q�϶�����
