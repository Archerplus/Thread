package wait_notify_insert_test;

public class Run {
	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for(int i = 0;i < 20;i++) {
			BackupA input = new BackupA(dbtools);
			input.start();
			BackupB output = new BackupB(dbtools);
			output.start();
		}
	}
}
