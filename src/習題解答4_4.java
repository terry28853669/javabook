//�ɦW:���D�ѵ�4_4.java
//����:1000cc�����C�Ѻ|���@�b�A�D�X�ĴX�Ѥ��q�֩�50cc�H
import javax.swing.JOptionPane; //�ޤJJOptionPane���O
public class ���D�ѵ�4_4 {
  public static void main (String[] �Ѽ�){
    double ���q=1000;
    int �Ѽ�=1;
    while(���q>=50) {
      ���q/=2; 
      �Ѽ�++;
    }
    String ��ܦr��="��"+�Ѽ�+"�ɤ����q��"+���q+"cc�A�w�֩�50cc";
    JOptionPane.showMessageDialog(null,��ܦr��);
    System.exit(0);
  } //��k:main() �w�q�϶�����
} //���O: ���D�ѵ�4_4 �w�q�϶�����
