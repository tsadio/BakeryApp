/**
 * Program to display bake choice based on diet restrictions
 * PseudoCode
 * First, Initialize 15 BakeryBuild objects named bake1 trough 15
 * for each bake, set the name, the price, the expiration date, the quantity
 * and the diet restrictions that will be set in an ArrayList
 * Declare three String variables for the user input
 * Display the available diet restrictions
 * Prompt the user to enter its diets restrictions
 * If the user don't have any diet restriction, he can choose "all" to display
 * the entire menu
 * Based on the user diet restriction, display the menu available
 * If there there are no bake matching the user diet restrictions, display
 * "Sorry, there are no such items."
 *
 */

//The concept used here if simple with bakes objects, ArrayList, conditional statements
//Even though it required several steps and can be useless in term of efficiency for
//a more complex program of the same type
//The output looks really good even though it is manually formatted using "\t"
//Also, there is a possibility of using while loop to make sure that the user enter
//the answer expected, but that restriction is not implemented here

import java.util.Scanner;
import java.util.ArrayList;

public class BakeryCall {
    //main method
    public static void main (String [] args) {
        //15 bake object declaration
        BakeryBuild bake1 = new BakeryBuild();
        BakeryBuild bake2 = new BakeryBuild();
        BakeryBuild bake3 = new BakeryBuild();
        BakeryBuild bake4 = new BakeryBuild();
        BakeryBuild bake5 = new BakeryBuild();
        BakeryBuild bake6 = new BakeryBuild();
        BakeryBuild bake7 = new BakeryBuild();
        BakeryBuild bake8 = new BakeryBuild();
        BakeryBuild bake9 = new BakeryBuild();
        BakeryBuild bake10 = new BakeryBuild();
        BakeryBuild bake11 = new BakeryBuild();
        BakeryBuild bake12 = new BakeryBuild();
        BakeryBuild bake13 = new BakeryBuild();
        BakeryBuild bake14 = new BakeryBuild();
        BakeryBuild bake15 = new BakeryBuild();
        ArrayList<BakeryBuild> bakerydb=new ArrayList<>();

        //Initialization of bake object with name, price, expiration date
        //quantity and an ArrayList to save diet restrictions
        //Same thing for the 15 bakes objects
        ArrayList <String> restrict1 = new ArrayList<String>();
        restrict1.add("gluten free");
        restrict1.add("dairy free");
        restrict1.add("peanut free");
        bake1.name = "White Bread";
        bake1.price = 10.95;
        bake1.expDate = "\t05/12/2020";
        bake1.dietRest = restrict1;
        bake1.quantity = 12;

        ArrayList <String> restrict2 = new ArrayList<String>();
        restrict2.add("gluten free");
        restrict2.add("dairy free");
        restrict2.add("egg free");
        bake2.name = "Banana Bread";
        bake2.price = 12.95;
        bake2.expDate = "\t\t05/15/2020";
        bake2.dietRest = restrict2;
        bake2.quantity = 25;

        ArrayList <String> restrict3 = new ArrayList<String>();
        restrict3.add("sesame free");
        restrict3.add("dairy free");
        restrict3.add("tree free");
        bake3.name = "Muffins    ";
        bake3.price = 16.50;
        bake3.expDate = "\t05/18/2020";
        bake3.dietRest = restrict3;
        bake3.quantity = 10;

        ArrayList <String> restrict4 = new ArrayList<String>();
        restrict4.add("gluten free");
        restrict4.add("egg free");
        restrict4.add("soy free");
        bake4.name = "Gluten Rolls";
        bake4.price = 3.50;
        bake4.expDate = "\t\t05/09/2020";
        bake4.dietRest = restrict4;
        bake4.quantity = 8;

        ArrayList <String> restrict5 = new ArrayList<String>();
        restrict5.add("treenut free");
        restrict5.add("sesame free");
        restrict5.add("coconut free");
        bake5.name = "Bread Box";
        bake5.price = 5.50;
        bake5.expDate = "05/11/2020";
        bake5.dietRest = restrict5;
        bake5.quantity = 5;

        ArrayList <String> restrict6 = new ArrayList<String>();
        restrict6.add("gluten free");
        restrict6.add("peanut free");
        restrict6.add("soy free");
        bake6.name = "Bread Pudding";
        bake6.price = 4.50;
        bake6.expDate = "05/20/2020";
        bake6.dietRest = restrict6;
        bake6.quantity = 25;

        ArrayList <String> restrict7 = new ArrayList<String>();
        restrict7.add("gluten free");
        restrict7.add("nut free");
        restrict7.add("organic");
        bake7.name = "Dozen Savory";
        bake7.price = 39.00;
        bake7.expDate = "\t\t05/08/2020";
        bake7.dietRest = restrict7;
        bake7.quantity = 8;

        ArrayList <String> restrict8 = new ArrayList<String>();
        restrict8.add("dairy free");
        restrict8.add("egg free");
        restrict8.add("soy free");
        bake8.name = "Raisin Bread";
        bake8.price = 10.95;
        bake8.expDate = "\t\t05/12/2020";
        bake8.dietRest = restrict8;
        bake8.quantity = 10;

        ArrayList <String> restrict9 = new ArrayList<String>();
        restrict9.add("wheat free");
        restrict9.add("soy free");
        restrict9.add("peanut free");
        bake9.name = "Spring Happy";
        bake9.price = 34.95;
        bake9.expDate = "\t\t05/07/2020";
        bake9.dietRest = restrict9;
        bake9.quantity = 20;

        ArrayList <String> restrict10 = new ArrayList<String>();
        restrict10.add("gluten free");
        restrict10.add("sesame free");
        restrict10.add("peanut free");
        bake10.name = "Large Buns";
        bake10.price = 5.95;
        bake10.expDate = "\t05/25/2020";
        bake10.dietRest = restrict10;
        bake10.quantity = 26;

        ArrayList <String> restrict11 = new ArrayList<String>();
        restrict11.add("dairy free");
        restrict11.add("tree free");
        restrict11.add("sesame free");
        bake11.name = "Savory Rolls";
        bake11.price = 3.55;
        bake11.expDate = "05/28/2020";
        bake11.dietRest = restrict11;
        bake11.quantity = 13;

        ArrayList <String> restrict12 = new ArrayList<String>();
        restrict12.add("gluten free");
        restrict12.add("organic");
        restrict12.add("nut free");
        bake12.name = "Pizza Crust";
        bake12.price = 6.95;
        bake12.expDate = "\t\t05/23/2020";
        bake12.dietRest = restrict12;
        bake12.quantity = 5;

        ArrayList <String> restrict13 = new ArrayList<String>();
        restrict13.add("gluten free");
        restrict13.add("dairy free");
        restrict13.add("treenut free");
        bake13.name = "Cinnamon Bread";
        bake13.price = 10.55;
        bake13.expDate = "05/26/2020";
        bake13.dietRest = restrict13;
        bake13.quantity = 18;

        ArrayList <String> restrict14 = new ArrayList<String>();
        restrict14.add("gluten free");
        restrict14.add("soy free");
        restrict14.add("nut free");
        bake14.name = "Pizza Bread";
        bake14.price = 12.95;
        bake14.expDate = "\t\t06/03/2020";
        bake14.dietRest = restrict14;
        bake14.quantity = 21;

        ArrayList <String> restrict15 = new ArrayList<String>();
        restrict15.add("gluten free");
        restrict15.add("dairy free");
        restrict15.add("sesame free");
        bake15.name = "Savory Bread";
        bake15.price = 15.55;
        bake15.expDate = "06/06/2020";
        bake15.dietRest = restrict15;
        bake15.quantity = 13;
        bakerydb.add(bake1);
        bakerydb.add(bake2);

        /*
        for(BakeryBuild b:bakerydb){
            System.out.println(b.name);
        }
        */

        //declaring a scanner
        Scanner in = new Scanner(System.in);
        String ans1, ans2, ans3;

        //Display the entire diet restriction
        System.out.println("Dietary Restriction are: \ngluten free, dairy free, peanut free, egg free," +
                "sesame free, tree free, \nsoy free, treenut free, coconut free, nut free," +
                " organic, wheat free.");

        //Prompt the user to enter its diet restriction to search for compatible bake
        //or enter all to display all the menu option
        System.out.println("To display the entire menu, type 'all', " +
                "or enter any dietary restriction:");
        ans1 = in.nextLine();

        //if the user enter all, display the entire menu
        if (ans1.equals("all")) {
            System.out.println("Name" + "\t\t\t\t\t\t" + "Diet Restrictions" + "\t\t\t\t\t\t\t\t\t" + "Exp. Date" +
                    "\t" + "Quantity" + "\t" + "Price/Unit" + "\t" + "Total Price");
            System.out.println("1. " + bake1);
            System.out.println("2. " + bake2);
            System.out.println("3. " + bake3);
            System.out.println("4. " + bake4);
            System.out.println("5. " + bake5);
            System.out.println("6. " + bake6);
            System.out.println("7. " + bake7);
            System.out.println("8. " + bake8);
            System.out.println("9. " + bake9);
            System.out.println("10. " + bake10);
            System.out.println("11. " + bake11);
            System.out.println("12. " + bake12);
            System.out.println("13. " + bake13);
            System.out.println("14. " + bake14);
            System.out.println("15. " + bake15);
        }

        //if the user enter any restriction, prompt the user for another
        //restriction and save it on ans2.
        // this program allowed the user to enter up to two diet restriction
        else {
            System.out.println("Do you have other dietary restriction?");
            ans2 = in.nextLine();

            //if the user want to enter another restriction, save it on ans3
            if (ans2.equals("yes")) {
                System.out.println("Enter the second dietary restriction: ");
                ans3 = in.nextLine();

                //Check for the entire menu if there are no such diet restriction
                //and display "Sorry, there are no such item."
                if (!restrict1.contains(ans1) || !restrict2.contains(ans1) || !restrict3.contains(ans1)
                        && !restrict4.contains(ans1) || !restrict5.contains(ans1) || !restrict6.contains(ans1)
                        && !restrict7.contains(ans1) || !restrict8.contains(ans1) || !restrict9.contains(ans1)
                        && !restrict10.contains(ans1) || !restrict11.contains(ans1) || !restrict12.contains(ans1)
                        && !restrict13.contains(ans1) || !restrict14.contains(ans1) || !restrict15.contains(ans1)
                        && !restrict1.contains(ans3) || !restrict2.contains(ans3) || !restrict3.contains(ans3)
                        && !restrict4.contains(ans3) || !restrict5.contains(ans3) || !restrict6.contains(ans3)
                        && !restrict7.contains(ans3) || !restrict8.contains(ans3) || !restrict9.contains(ans3)
                        && !restrict10.contains(ans3) || !restrict11.contains(ans3) || !restrict12.contains(ans3)
                        && !restrict13.contains(ans3) || !restrict14.contains(ans3) || !restrict15.contains(ans3)) {
                    System.out.println("Sorry there are no such item.");
                }

                System.out.println("Name" + "\t\t\t\t\t\t\t" + "Diet Restrictions" + "\t\t\t\t\t\t\t\t" + "Exp. Date" +
                        "\t" + "Quantity" + "\t" + "Price/Unit" + "\t" + "Total Price");

                //Use the if statement to determine if the bake contains the user double diet restriction
                //Since every bake restrictions are save in an ArrayList, the method contains
                //is used to determine if the restriction is i the list
                //if the restriction is in the ArrayList, display the bake
                //This will be done for the 15 bakes available
                if (restrict1.contains(ans1) && restrict1.contains(ans3)) {
                    System.out.print("1. ");
                    System.out.println(bake1);
                }
                if (restrict2.contains(ans1) && restrict2.contains(ans3)) {
                    System.out.print("2. ");
                    System.out.println(bake2);
                }
                if (restrict3.contains(ans1) && restrict3.contains(ans3)) {
                    System.out.print("3. ");
                    System.out.println(bake3);
                }
                if (restrict4.contains(ans1) && restrict4.contains(ans3)) {
                    System.out.print("4. ");
                    System.out.println(bake4);
                }
                if (restrict5.contains(ans1) && restrict5.contains(ans3)) {
                    System.out.print("5. ");
                    System.out.println(bake5);
                }
                if (restrict6.contains(ans1) && restrict6.contains(ans3)) {
                    System.out.print("6. ");
                    System.out.println(bake6);
                }
                if (restrict7.contains(ans1) && restrict7.contains(ans3)) {
                    System.out.print("7. ");
                    System.out.println(bake7);
                }
                if (restrict8.contains(ans1) && restrict8.contains(ans3)) {
                    System.out.print("8. ");
                    System.out.println(bake8);
                }
                if (restrict9.contains(ans1) && restrict9.contains(ans3)) {
                    System.out.print("9. ");
                    System.out.println(bake9);
                }
                if (restrict10.contains(ans1) && restrict10.contains(ans3)) {
                    System.out.print("10. ");
                    System.out.println(bake10);
                }
                if (restrict11.contains(ans1) && restrict11.contains(ans3)) {
                    System.out.print("11. ");
                    System.out.println(bake11);
                }
                if (restrict12.contains(ans1) && restrict12.contains(ans3)) {
                    System.out.print("12. ");
                    System.out.println(bake12);
                }
                if (restrict13.contains(ans1) && restrict13.contains(ans3)) {
                    System.out.print("13. ");
                    System.out.println(bake13);
                }
                if (restrict14.contains(ans1) && restrict14.contains(ans3)) {
                    System.out.print("14. ");
                    System.out.println(bake14);
                }
                if (restrict15.contains(ans1) && restrict15.contains(ans3)) {
                    System.out.print("15. ");
                    System.out.println(bake15);
                }

            }

            //The else statement is for users with only one diet restriction
            else {
                //Check if no bake contains such restriction and display "Sorry, there are no such item."
                if (!restrict1.contains(ans1) && !restrict2.contains(ans1) && !restrict3.contains(ans1)
                        && !restrict4.contains(ans1) || !restrict5.contains(ans1) || !restrict6.contains(ans1)
                        && !restrict7.contains(ans1) || !restrict8.contains(ans1) || !restrict9.contains(ans1)
                        && !restrict10.contains(ans1) || !restrict11.contains(ans1) || !restrict12.contains(ans1)
                        && !restrict13.contains(ans1) || !restrict14.contains(ans1) || !restrict15.contains(ans1)) {
                    System.out.println("Sorry there are no such item.");
                }
                System.out.println("Name" + "\t\t\t\t\t\t" + "Diet Restrictions" + "\t\t\t\t" + "\t\t\t\t\tExp. Date" +
                        "\t" + "Quantity" + "\t" + "Price/Unit" + "\t" + "Total Price");

                //Use the if statement to determine if the bake contains the user single diet restriction
                //Since every bake restrictions are save in an ArrayList, the method contains
                //is used to determine if the restriction is i the list
                //if the restriction is in the ArrayList, display the bake
                //This will be done for the 15 bakes available
                if (restrict1.contains(ans1)) {
                    System.out.print("1. ");
                    System.out.println(bake1);
                }
                if (restrict2.contains(ans1)) {
                    System.out.print("2. ");
                    System.out.println(bake2);
                }
                if (restrict3.contains(ans1)) {
                    System.out.print("3. ");
                    System.out.println(bake3);
                }
                if (restrict4.contains(ans1)) {
                    System.out.print("4. ");
                    System.out.println(bake4);
                }
                if (restrict5.contains(ans1)) {
                    System.out.print("5. ");
                    System.out.println(bake5);
                }
                if (restrict6.contains(ans1)) {
                    System.out.print("6. ");
                    System.out.println(bake6);
                }
                if (restrict7.contains(ans1)) {
                    System.out.print("7. ");
                    System.out.println(bake7);
                }
                if (restrict8.contains(ans1)) {
                    System.out.print("8. ");
                    System.out.println(bake8);
                }
                if (restrict9.contains(ans1)) {
                    System.out.print("9. ");
                    System.out.println(bake9);
                }
                if (restrict10.contains(ans1)) {
                    System.out.print("10. ");
                    System.out.println(bake10);
                }
                if (restrict11.contains(ans1)) {
                    System.out.print("11. ");
                    System.out.println(bake11);
                }
                if (restrict12.contains(ans1)) {
                    System.out.print("12. ");
                    System.out.println(bake12);
                }
                if (restrict13.contains(ans1)) {
                    System.out.print("13. ");
                    System.out.println(bake13);
                }
                if (restrict14.contains(ans1)) {
                    System.out.print("14. ");
                    System.out.println(bake14);
                }
                if (restrict15.contains(ans1)) {
                    System.out.print("15. ");
                    System.out.println(bake15);
                }
            }

        }

    }
}
