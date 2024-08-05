package d240805_Mon_Task.e.api.ex04;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

// W2 D11 Task2

public class ArrayCopy {

	// Field

	// Constructor
	public ArrayCopy() {
	}

	// Method
	public List<String> moveToVector(String[] datas) {
		Stack<String> dataL = new Stack<String>();

		for (String data: datas) {
			dataL.add(0, data);
		}
		
		return dataL;
	}

}
// class end
