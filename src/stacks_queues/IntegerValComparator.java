package stacks_queues;

import java.util.Comparator;

public class IntegerValComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
//		if(o1<o2){
//			return 1;
//		} else {
//			return -1;
//		}
	}

}
