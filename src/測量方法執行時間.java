//�ɦW:���q��k����ɶ�.java
//����:���q��k����ɶ�����H���O
abstract class ���q��k����ɶ� {
  abstract void �Q����k();  //��H����k�A�ȦC�X�ŧi�����Ӥw
  public long ���q�ɶ�(int ���榸��) {
    long ��k�}�l�ɲ@���=System.currentTimeMillis();
    for (int i=1;i<=���榸��; ++i) �Q����k();
    long ��k����ɲ@���=System.currentTimeMillis();
    return (��k����ɲ@���-��k�}�l�ɲ@���);
  } //��k:���q�ɶ� �w�q�϶�����
} //���O:���q��k����ɶ� �w�q�϶�����
