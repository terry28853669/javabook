//�ɦW:�ż�.java
//����:�@�ө�H���ż����O
public abstract class �ż� {
  protected int �{��;    //�x�s�żƥثe����
  protected int ����;    //�x�s�żƭ�������
  �ż�() {   //�w�](�L�Ѽƪ�)�غc��k
    ����=0;
  }
  protected int �^�쭺��() {
    �{��=����;
    return �{��;
  }
  protected abstract int �즸�@��();
  //��k �즸�@��() �ŧi��abstract�A�]���u���ŧi�����Ӥw  
  //��@�ά��p�⦸�@�����Ȩæs�J�{�Ȥ���A�Ǧ^�s�s�J���{��
  				      
  public void �L�X�ż�(int ����) {
    System.out.print(�^�쭺��()+" ");
    for (int i=1; i< ����; i++)
      System.out.print(�즸�@��() + " ");
    System.out.println();
  } //��k:�L�X�ż�() �w�q�϶�����
} //���O:�ż� �w�q�϶�����
