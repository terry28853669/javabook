//�ɦW:���D6_1.java
//����:�����ܼƪ��ϥνd��(scope)
class ���O {
  int ���=500;
  void ��k1() {
    int ���=100;
    System.out.println("����1:"+���);
    ��k2();
  }
  void ��k2() {
    System.out.println("����2:"+���);
  }
  void ��k3() {
    System.out.println("����3:"+���);
    for(int ���=1;���<=3;++���) 
      System.out.println("����4:"+���);
    System.out.println("����5:"+���);
  }
} //���O:���O �w�q�϶�����

class ���D6_1 {
  public static void main(String[] �Ѽ�) {
    ���O ����=new ���O();
    ����.��k1();
    ����.��k2();
    ����.��k3();
  } //��k:main() �w�q�϶�����
} //���O:���D6_1 �w�q�϶�����
