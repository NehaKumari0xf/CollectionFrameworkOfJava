import java.util.ArrayList;

public class ArrayListAllOperation {

    public static void main(String[] args) {
        System.out.println("\n\tArray List All Operation\n--------------------------------------\n");
        ArrayList<String> list1 = new ArrayList<>();

        //1. data add using add()
        list1.add("C");
        list1.add("C++");
        list1.add("Java");
        list1.add("Python");
        list1.add("C#");
        list1.add("Ruby");
        list1.add("Kotlin");
        list1.add("Html");
        list1.add("CSS");
        list1.add("Java Script");
        list1.add("PHP");
        list1.add("PhpMyAdmin");
        list1.add("Bootstrap");
        list1.add("Nodejs");
        list1.add("Angular");
        
        System.out.println("\nArray data in array format:-\n---------------------------------\n");
        System.out.println(list1);

        //2. print array size using size()
        System.out.println("Size of list: "+list1.size());

        //print data using foreach method
        System.out.println("\nData print using forEach():\n------------------------------------\n");
        for (String string : list1) {
            System.out.println(string);
        }

        //3. add data at specific location in list
        System.out.println("\nAdd Data at specific location\n------------------------------------\n");
        list1.add(7, "DSA");
        //print data 
        System.out.println("All Data are:-");
        for (String string : list1) {
            System.out.println(string);
        }

        //4. add all data in another list
        //first you need to create another list to add all data
        System.out.println("\nAdding all data of list1 in list2 using addAll()\n--------------------------------------------\n");
        ArrayList<String> list2 = new ArrayList<>();
        //now add all data of list1 in list2
        list2.addAll(list1);
        //display data of list2
        System.out.println("List2 data are:-");
        for (String string : list2) {
            System.out.println(string);
        }
        //5. remove data
        System.out.println("\nNow Remove Data using remove()\n--------------------------------------\n");
        list1.remove(5);
        System.out.println("5th data are removed successfully....\nYour Updated data are:-");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("Check List is empty or not using empty()");
        //6. if array is empty then print array is empty
        if (list1.isEmpty()) {
            System.out.println("List is empty!");
        }else{
            System.out.println("List is not empty");
        }
    }
}