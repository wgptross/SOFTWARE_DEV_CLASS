import java.util.Scanner;
class module_6{

    
    
    public static void create(String[][] names){
        Scanner input = new Scanner(System.in);
        String value;
        int counter = 0;
        System.out.print("Enter the name of the new task: ");
        value = input.nextLine();
        
        for(int i = 0; i < names.length; i++){
            if(names[i][0] == null){
                
                counter++;
            }
            
        }
        System.out.println(counter);
        System.out.println(names.length + " (names length)");
        names[counter - 1][0] = value;

        printTitle("Text Editor", false);
        System.out.print("\n-------------------------------------------\n");
        System.out.print("You have 9 lines for notes use '|' to stop \n");
        System.out.print("Enter task information or notes here: \n");
        System.out.print("-------------------------------------------\n");
        
        String[] lineReader = new String[10];
        //System.out.print("\n\\\\ ");
        boolean cont = true;
        int length;
        while(cont == true){
            //System.out.print("\n\\\\ ");
            
            
            for(int i = 0; i < lineReader.length; i++){

                System.out.print(i + "| ~ ");
                //System.out.println("id" + i);
                
                lineReader[i] = input.nextLine();
                length = lineReader[i].length();
                
                //System.out.print(i);
                
                if(lineReader[i].length() >= 1){
                    char end = '|';
                    if(lineReader[i].charAt(length - 1) == end){
                        System.out.print("-------------------------------------------\n");
                        System.out.print("closing note... \n\n");
                        i = 9;
                    }
                }

                if(i > 8){
                    
                    cont = false;
                }
                
            }
        }
        // i will now conver the lineReader[] array to one long string and put it intet the names[][] array
        //for(String d: lineReader){
            //System.out.println(d);
        //}
        int linesCounter = 0;
        for(int i = 0; i < lineReader.length; i++){
            if(lineReader[i] == ""){
                linesCounter++;
            }
            if(lineReader[i] == null){
                lineReader[i] = "";
            }
            
        }
        String insert;
        if(linesCounter < 10){
            insert = "" + lineReader[0] + "\n" + "" + lineReader[1] + "\n" + "" + lineReader[2] + "\n" + "" + lineReader[3] + "\n" + "" + lineReader[4] + "\n" + "" + lineReader[5] + "\n" + "" + lineReader[6] + "\n" + "" + lineReader[7] + "\n" + "" + lineReader[8] + "\n" + "" + lineReader[9] + "\n";
        } else {
            insert = "no notes recieved";
        }
        names[counter - 1][1] = insert;
        //System.out.print("\n\n" + names[counter - 1][1] + " (names array)");
        


        //System.out.println(names[counter - 1][1]);
        //int mutCounter = (counter -= counter);
        //System.out.println(mutCounter);
        //names[1][0] = value;
        
    }

    public static void execute(int number, String[][] names){
        switch (number){
            case 0:
                create(names);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    public static void mainMenu(boolean first, String[][] names){
        Scanner input = new Scanner(System.in);
        int value;
        if(first){
            System.out.println("what would you like to do?");
        }
        System.out.println("\n[0]> add a new task");
        System.out.println("[1]> edit a task");
        System.out.println("[2]> list tasks");
        System.out.println("[3]> delete task");

        System.out.print("\n#: ");

        value = input.nextInt();
        execute(value, names);
        mainMenu(false, names);
        
    }

    

    public static void printTitle(String title, boolean large){
        int titleLength = title.length();
        for(int i = 0; i < titleLength + 18; i++){
            System.out.print("-");
        }
        if(large){
            System.out.print("\n|                          |");

        }
        System.out.print("\n|        " + title + "        |");
        if(large) {
            System.out.print("\n|                          |");

        }

        System.out.println();
        for(int i = 0; i < titleLength + 18; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static String[][] start(){
        int listCount; 
        Scanner input = new Scanner(System.in);
        printTitle("Welcome", false);
        System.out.println("How much tasks do you have?");
        System.out.print("Please enter a number here: ");
        
        listCount = input.nextInt();
        String[][] table = new String[listCount][4];
        return table;

    }

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        
        String[][] table = start();

        printTitle("To Do List", true);
        mainMenu(true, table);

        
        

    }
}