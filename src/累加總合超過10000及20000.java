//�ɦW:�֥[�`�X�W�L10000��20000.java
//����:1+2+�K+n>10000�A�Q��while�ԭz�Dn
//     1+2+�K+m>20000�A�Q��do�ԭz�Dm

public class �֥[�`�X�W�L10000��20000{
  public static void main (String[] �Ѽ�){
    int i=0;		//�ܼ�i�ΥH�����ثe�N�֥[�����
    int �s�M=0;   	//�ܼƳs�M�ΥH�����ثe�w�֥[���`�M
    while (�s�M<=10000) 
      �s�M += ++i;
    System.out.println("1+2+�K+"+i+">10000");
    do �s�M += ++i;  while(�s�M<=20000);
    System.out.println("1+2+�K+"+i+">20000");
  }//��k:main() �w�q�϶�����
} //���O:�֥[�`�X�W�L10000��20000 �w�q�϶�����
