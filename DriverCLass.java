import java.util.Iterator;



// Create the class.

public class DriverCLass

{

// Method to display the values of the list.

    public static void DispalyList(SortedList<Integer> list)

    {

        System.out.print("Sorted List:");



// use for loop to iterate the list.

        for(Iterator<Integer> iterator = list.iterator();

            iterator.hasNext(); )

        {

            System.out.print(" "+iterator.next());

        }



        System.out.println("\n");

    }



// Start the main method of the program.

    public static void main(String[] args)

    {



// Craete an object of the SortedList class.

        SortedList<Integer> values =

                new SortedList<Integer>();



// insert the values in teh list.

        values.insert(80);

        values.insert(20);

        values.insert(10);



// Display the list.

        DispalyList(values);



// Remove the value from the list.

        System.out.println

                ("Removing the value 10 from the list.");

        values.remove(10);



// Display the list.

        DispalyList(values);



// inert the value in the list.

        System.out.println

                ("Inserting the value 50 to the list.");

        values.insert(50);

        System.out.println

                ("Inserting the value 30 to the list.");

        values.insert(30);



// Display the list.

        DispalyList(values);



// Retreive the value from the list.

        System.out.println("Value at the index 2 is: " +

                values.retrieve(2));

        System.out.println("Value at the index 10 is: "

                + values.retrieve(10)+"\n");



// Seach the value in the list.

        System.out.println("Searching the value 50: "+

                values.search(50)+"\n");



// Display.

        DispalyList(values);

    }

}
