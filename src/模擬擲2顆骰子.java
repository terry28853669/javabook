//����:�������Y�G����l10000���A�òέp�G����l�`count�X�{������
import javax.swing.JOptionPane;

public class �����Y2����l {
	public static void main(String[] �Ѽ�) {
		int count;
		int[] counter = new int[13];
		String msg;
		for (int i = 1; i <= 10000; i++) {
			count = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
			counter[count] += 1;
		} // �ԭz:for �϶�����
		msg = "�Y�G����l10000���A�έp\n";
		for (count = 2; count <= 12; count++)
			msg += "\n " + (count >= 10 ? " " : "  ") + count + "     " + counter[count];
		JOptionPane.showMessageDialog(null, msg);
	} // ��k:main() �w�q�϶�����
} // ���O:���D�ѵ�4_5 �w�q�϶�����
