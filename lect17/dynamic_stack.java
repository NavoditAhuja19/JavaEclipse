package lect17;

import lect16.stack;

public class dynamic_stack extends stack {

	@Override
	public void push(int item) throws Exception {
		if (isfull()) {
			// create new array of twice size
			int[] na = new int[2 * data.length];
			// copy elements in na
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}
			// reference change of data
			data = na;
		}
		super.push(item);
	}

}
