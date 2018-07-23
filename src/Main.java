import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variablee
        // name,
        //category (i.e. chores, outdoor, family),
        //priority level (i.e. 1=low, 2=medium, 3=high), which is randomly selected
        //isDone (true/false)
        String name;
        String catagory;
        String priorityLevel = "";
        boolean isDone;
        int priorityLevelLow=0;
        int priorityLevelMedium=0;
        int priorityLevelHigh=0;
        int sumOfItem = 0;
        int totalDoneT = 0;
        int totalDoneF = 0;
        Scanner sca = new Scanner(System.in);
        Random rand = new Random();
        // Generate the level
        int level = 1 + rand.nextInt(3);
        if (level == 1) {
            priorityLevel = "low";
        } else if (level == 2) {
            priorityLevel = "medium";
        } else if (level == 3) {
            priorityLevel = "high";
        }
        // this is to see the result
        // System.out.println("you picked level " + level);
        //  System.out.println(priorityLevel);
        String userInput = "";
        while (!userInput.contains("quit")) {
            System.out.println("Enter the item you have to do: ");
            name = sca.next();
            System.out.println("Enter the category of this item: ");
            catagory = sca.next();
            System.out.println("Is this item completed? ");
            isDone = sca.nextBoolean();
            sumOfItem = sumOfItem + 1;
            // System.out.println("Things you have done " + sumOfItem);
            // isDone+= isDone;

            if (isDone == true) {
                //System.out.println("complite");
                totalDoneT = totalDoneT + 1;
                //   System.out.println("Done things that are true" + totalDoneT);
            } else if (isDone == false) {

                totalDoneF = totalDoneF + 1;
                // System.out.println("done things that are false" + totalDoneF);

            }
            if (priorityLevel.equalsIgnoreCase("low")){
                priorityLevelLow=priorityLevelLow+1;
            }else if(priorityLevel.equalsIgnoreCase("medium")){
                priorityLevelMedium=priorityLevelMedium+1;
            }else if(priorityLevel.equalsIgnoreCase("high")){
                priorityLevelHigh=priorityLevelHigh+1;
            }

            System.out.println("Do you want to add another item? (Type 'quit' to exit): ");
            userInput = sca.next();
        }


//            System.out.println("Do you want to add another item? (Type 'quit' to exit): ");
//            userInput = sca.next(); Low-level
        System.out.println("Low-level: " + priorityLevelLow +"\t" + "Medium-level: " + priorityLevelMedium +"\t" + "High-level: " + priorityLevelHigh );
        System.out.println("Things you have done " + sumOfItem);
        System.out.println("Done things that are true " + totalDoneT);
        System.out.println("Done things that are false " + totalDoneF);
    }
}

