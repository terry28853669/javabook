//�ɦW:���D�ѵ�4_3.java
//����:��J�@�Ӿ��n�A�íp��1!+2!+3!+�K+n!����
import javax.swing.JOptionPane; //�ޤJJOptionPane���O
public class ���D�ѵ�4_3 {
  public static void main (String[] �Ѽ�){
    String �r��;    //�Ω��x�s�ϥΪ̿�J���r��
    int n;          //�Ω��x�s���n
    �r��=JOptionPane.showInputDialog("��J�@�Ӿ��");
    n=Integer.parseInt(�r��);
    double �`�M=0;
    for(double �B�I��=1,������=1; �B�I��<=n; �B�I��+=1, ������*=�B�I��)
      �`�M+=������;
    String ��ܦr��="1!+2!+3!+�K+n!(n="+n+")���Ȭ�:"+�`�M;
    JOptionPane.showMessageDialog(null,��ܦr��);
    System.exit(0);
  } //��k:main() �w�q�϶�����
} //���O: ���D�ѵ�4_3 �w�q�϶�����
