package d240805_Mon_Task.e.api.ex04;

import java.util.Vector;

// W2 D11 Task2

public class ArrayCopy {

	// Field

	// Constructor
	public ArrayCopy() {
	}

	// Method
	public Vector<String> moveToVector(String[] datas) {
		Vector<String> dataV = new Vector<String>();

		for (String data: datas) {
			dataV.add(0,data);
		}
		
		return dataV;
	}

}
// class end
