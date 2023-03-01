package Main;

import exercice1.CountTheInt;
import exercice2.TwoStacksInAnArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountTheInt countTheInt = new CountTheInt();
		countTheInt.append(1);
		countTheInt.append(2);
		countTheInt.append(1);
		countTheInt.append(3);
		countTheInt.append(1);
		countTheInt.append(1);
		countTheInt.append(2);
		
		countTheInt.printKeyAndResult(1);

		//exercice2
		
		TwoStacksInAnArray ts = new TwoStacksInAnArray(5);
		ts.push1(5); // push 5 to stack 1
		ts.push2(10); // push 10 to stack 2
		ts.push2(15); // push 15 to stack 2
		ts.push1(11); // push 11 to stack 1
		ts.push2(7); // push 7 to stack 2

		System.out.println("Popped element from stack 1: " + ts.pop1()); // pop from stack 1 and print popped element
		ts.push2(40); // push 40 to stack 2

		System.out.println("Popped element from stack 2: " + ts.pop2()); // pop from stack 2 and print popped element

	}

}
