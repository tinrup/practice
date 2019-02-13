package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListPractice {

	
	int numberOfCopys = 5;
	
	class Data{
		
		String name;
		long phoneNum;
		int idNum;
		int numbers;
		
		public Data(String name, long phoneNum, int idNum, int numbers) {
	
			this.name = name;
			this.phoneNum = phoneNum;
			this.idNum = idNum;
			this.numbers = numbers;
		}
		
		
	}
	
	public void addValues(int numbers[],String name[],int idNum[],int phoneNum[]) {
		
		ArrayList<Data> lst = new ArrayList<>();
		
		for (int i = 0; i < numberOfCopys; i++) {
			
			lst.add(new Data(name[i], phoneNum[i], idNum[i], numbers[i]));
		}
		
		printValues(lst);
	}
	
	public void printValues(ArrayList<Data> list) {
		
		for (int i = 0; i < numberOfCopys; i++) {
			
			Data data = list.get(i);
			
			System.out.println(data.idNum + " " + data.name + " " +
					data.numbers + " " + data.phoneNum);
		}
	}
	
	public static void main(String[] args) {
		
		int idNum[] = {3,5,6,7,8};
		String name[] = {"aragorn","frodo","bilbo","gimli","boromir"};
		int numbers[] = {321,444,55,22,11};
		int phoneNum[]= {321321,43242423,534535,654654,765765};
		
		ListPractice lp = new ListPractice();
		
		lp.addValues(numbers, name, idNum, phoneNum);
		
		
	}
}