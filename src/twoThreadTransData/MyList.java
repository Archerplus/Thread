package twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List list = new ArrayList();
	public void add() {
		list.add("Archer");
	}
	public int size() {
		return list.size();
	}
}
