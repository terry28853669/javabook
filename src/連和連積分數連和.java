//�ɦW:�s�M�s�n���Ƴs�M.java
//����:��J�@���n�A�íp��1+2+�K+n(�s�M)�A��1*2*�K*n(�s�n)
//��(1/1)+(1/2)+�K+(1/n)(���Ƴs�M)����
import javax.swing.JOptionPane;

public class �s�M�s�n���Ƴs�M {
	public static void main(String[] �Ѽ�) {
		int n; // �Ω��x�s�ϥΪ̿�J�����
		int �s�M = 0; // �Ω��x�s1+2+�K���֥[��
		double �s�n = 1.0; // �Ω��x�s1*2*�K���֭���
		double ���Ƴs�M = 0.0;// �Ω��x�s1(1/1)+(1/2)+�K���֥[��
		String ��J�r�� = JOptionPane.showInputDialog("�п�J�@�����");
		n = Integer.parseInt(��J�r��);
		for (int i = 1; i <= n; ++i) { // for�j��ԭz��i���Ȭ�1,2,�K,n
			�s�M += i; // �Ni���Ȳ֥[�ܳs�M��
			�s�n *= i; // �Ni���Ȳ֭��ܳs�n��
			���Ƴs�M += (1.0 / i); // �N(1/i)���Ȳ֥[�ܤ��Ƴs�M��
		}
		String ��ܦr�� = "�A��J������Ƭ�" + n;
		��ܦr�� = ��ܦr�� + "\n1��" + n + "���s�M��" + �s�M;
		��ܦr�� = ��ܦr�� + "\n1��" + n + "���s�n��" + �s�n;
		��ܦr�� = ��ܦr�� + "\n1��" + n + "�����Ƴs�M��" + ���Ƴs�M;
		JOptionPane.showMessageDialog(null, ��ܦr��);
		System.exit(0);
	} // ��k:main() �w�q�϶�����
} // ���O:�s�M�s�n���Ƴs�M �w�q�϶�����
