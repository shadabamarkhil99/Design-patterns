import java.util.*;
public class IteratorDemo {
    
    public static void main(String[] args) {
     // Create an array list
     ArrayList al = new ArrayList();
     
     
    // add elements to the array list
    al.add("Ahmad");
    al.add("Mahmood");
    al.add("Ali");
    al.add("Salim");
    al.add("MOhammad");
    al.add("Ali");
    
    // use iterator to disply content of al
        System.out.println("Original contents of al: ");
        Iterator itr = al.iterator();
        
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + " ");  
        }
        System.out.println();
        
        // modify objects being iterated
        ListIterator litr = al.listIterator();
        
        while(litr.hasNext()){
            Object element= litr.next();
            litr.set(element + " ");
        }
        System.out.println("Modified contents al : ");
        itr = al.iterator();
        
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + " ");
        }
        System.out.println();
        
        // Now , Disply the list backwards
        System.out.println("Modified list backwards: ");
        
        while(litr.hasPrevious()){
            Object element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
