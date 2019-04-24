package exercises;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class NASACountdown {
	public static void main(String[] args) {
		System.out.println("A rocket is launched. The countdown is starting:");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("blastoff");

	}
}
