//�ɦW:�����Y��l.java
//����:�������Y��l10000���A�òέp�Ucount�X�{������
import javax.swing.JOptionPane;

public class �����Y��l {
	public static void main(String[] arg) {
		int count;
		int[] counter = new int[7];
		String S;
		for (int i = 1; i <= 10000; i++) {
			count = (int) (Math.random() * 6 + 1);
			counter[count] += 1;
		} // �ԭz:for �϶�����
		S = "�Y��l10000���I�ƥX�{����:";
		for (count = 1; count <= 6; count++)
			S += "\n  " + count + "      " + counter[count];
		JOptionPane.showMessageDialog(null, S);
	} 
}
