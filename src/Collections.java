
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		String[] myAnimals= {"cat", "dog", "platypus", "bear", "wolf", "chimera"};
		
		// when you create a list you need to tell what type of data you will put in
		// this time we put String inside a List
		List<String> list = new ArrayList<String>();
		
		
		// add the myAnimal array to List
		for(String animal : myAnimals){
			list.add(animal);
		}
		
		String[] moreAnimals = {"cat", "dog"}; 
		
		List<String> listAnother = new ArrayList<String>();
		
		for(String animalia : moreAnimals){
			listAnother.add(animalia);
		}
		
		// print out list
		for(int i = 0; i < list.size(); i++ ){
			System.out.printf("%s ", list.get(i));
		}
		
		editList(list, listAnother);
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++ ){
			System.out.printf("%s ", list.get(i));
		}
		
		removeStuff(list, 2, 3);
		printMe(list);
		reverseMe(list);
		
	}
	
	public static void editList(Collection<String> list1, Collection<String> list2){
		
		//loop through each of item
		Iterator<String> iterate = list1.iterator();
		
		// loop if there still an item in the list
		while(iterate.hasNext()){
			
			// if list2 contains the current item in the iterate.next()
			if(list2.contains(iterate.next())){
				
				// remove it from the list
				iterate.remove();
			}
		}
	}
	
	public static void printMe(List<String> list){
		for(String animal : list){
			System.out.printf("%s ", animal);
		}
		System.out.println();
	}
	
	public static void removeStuff(List<String> list, int from, int to){
		// index from and to of array to be deleted
		list.subList(from, to).clear();
	}
	
	public static void reverseMe (List<String> list){
		
		// making the list ready to be iterated
		// list.listIterator(list.size()) is setting the start from what index to start
		// the iteration, this time the very last index because we are about to reverse it
		ListIterator<String> partyAnimals = list.listIterator(list.size());
		
		while(partyAnimals.hasPrevious()){
			System.out.printf("%s ", partyAnimals.previous());
		}
	}

}
