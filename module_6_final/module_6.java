import java.util.Scanner;
class module_6{

    public static void errorReturn(String errorMessage){
        System.out.println("\nERROR: " + errorMessage);
    }

    public static void list(String[][] names){
        printTitle("Notes", false);
        int counter = 0;
        int notNull = 0;
        for(int i = 0; i < names.length; i++ ){
            if(names[i][0] == null){
                counter++;
            }
            if(names[i][0] != null){
                notNull++;
            }
        }
        if(counter <= names.length - 1){
            if(notNull == 1){
                
                System.out.println("(You have " + notNull + " task)");

            } else {
                
                System.out.println("(You have " + notNull + " tasks)");
            }
        } else {
            errorReturn("You have no tasks");
            mainMenu(false, names);
        }
        
        String[] priorityArray = new String[names.length];
        System.out.println(priorityArray.length);
        int notNullPriority = 0;
        int priorityCounter = 0;
        for(int t = 0; t < names.length; t++){
            if(priorityArray[t] == null){
                System.out.println("prio added ");
                priorityCounter++;
            }
        }
        for(int u = 0; u < names.length; u++){
            
            if(names[u][2] != null){
                priorityArray[counter] = u + " test";
                System.out.println(priorityCounter + " priority counter");
            }
        }
        for(String e: priorityArray){
            System.out.println(e);
        }

        for(int k = 0; k < notNull; k++){
            

            int newCount = counter - 1;
            int space = 10;
            //System.out.print(k + 1);
            //System.out.print(" | Title: ");
            //System.out.print(names[k + counter][0]);
            //printSpace(space - names[k + counter][0].length());
            //System.out.print(" Priority: ");
            //System.out.print(names[k + counter][2] + " | ");
            //System.out.print("\n");
            
        }
        
    }

    public static void printSpace(int count){
        for(int i = 0; i < count; i++){
            System.out.print(" ");
        }
        System.out.print(" | ");
    }

    public static boolean checkForTitle(String[][] names, String search){
        int counter = 0;
        int possibleCounter = 0;
        int notNull = 0;
        String possible[] = new String[names.length];
        for(int i = 0; i < names.length; i++){
            if(names[i][0] == null){
                counter++;
            } else {
                notNull++;
            }

        }
        for(int i = 0; i < possible.length; i++){
            if(possible[i] == null){
                possibleCounter++;
            }
        }
        //System.out.println(names.length + " names length");
        //System.out.println(counter + " counter length");
        //System.out.println(possibleCounter + " poss counter");
        //System.out.println(notNull + " not null");
        if(counter == names.length){
            //System.out.println("return true 0");
            return true;
        } else {
            int noLength = 0;
            //System.out.println("return false 0");
            //loop through all of names find possible names and putting them in the possible array
            for(int i = 0; i < names.length; i++){
                if(names[i][0] != null){
                    if(names[i][0].charAt(0) == search.charAt(0)){
                        //System.out.println("charat found");
                        int match = 0;
                        int noMatch = 0;
                        boolean cont = true;
                        possible[possibleCounter - 1] = names[i][0];
                        while(cont){
                            for(int j = 0; j < names.length; j++){
                                if(names[j][0] != null){
                                    for(int y = 0; y < search.length(); y++){
                                        if(names[j][0].length() < search.charAt(y)){
                                            return true;
                                        }
                                        if(names[j][0].charAt(y) == search.charAt(y)){
                                            match++;

                                            //System.out.println(match + " match found");
                                            cont = false;
                                        } else {
                                            noMatch++;
                                            //System.out.println(noMatch + " no match found");
                                            cont = false;
                                        }
                                    }
                                }
                            }
                            if(match >= search.length()){
                                //System.out.println(match + " match count");
                                //System.out.println(noMatch + " noMatch count");
                                //System.out.println("match exists");
                                errorReturn("name is already taken");
                                mainMenu(true, names);
                            }
                        }
                    }
                }
            }
            for(String j: possible){
                if(j != null){
                    System.out.println(j + " poss array");
                }
            }
        }
        return true;
    }
        
    
    public static void create(String[][] names){
        Scanner input = new Scanner(System.in);
        String value = null;
        int counter = 0;
        int newCount = 0;
        System.out.print("Enter the name of the new task: ");
        
        value = input.nextLine();
        if(value == ""){
            errorReturn("Invalid name");
            mainMenu(false, names);
        }
        for(int k = 0; k < names.length; k++){
            if(names[k][0] != null){
                newCount++;
            }
        }
        

        if(value.length() >= 16){
            errorReturn("Name is too long");
            mainMenu(false, names);
        }

        if(value.charAt(0) == '.'){
            errorReturn("Invalid name");
            mainMenu(false, names);
        }
        int emptyCount = 0;

        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == ' '){
                emptyCount++;
            }
        }
        //System.out.println(value.charAt(emptyCount));
        if(emptyCount > 0){
            errorReturn("Invalid name");
            mainMenu(false, names);
        }
        




        for(int i = 0; i < names.length; i++){
            if(names[i][0] == null){
                
                counter++;
            }
            
        }
        

        //names[counter - 1][0] = value;

        //System.out.println(checkForTitle(names, value));
        if(checkForTitle(names, value)){
            //System.out.println(counter - 1 + " set here");
            names[counter - 1][0] = value;
        }
        
       
        
        //System.out.println(value + " has been set as counter " + counterPrint);
        //checkForTitle(names, counterPrint + "");
        
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
                boolean printAgain = true;
                System.out.print(i + "| ~ ");
                //System.out.println("id" + i);
                
                lineReader[i] = input.nextLine();
                length = lineReader[i].length();
                
                //System.out.print(i);
                
                if(lineReader[i].length() >= 1){
                    char end = '|';
                    if(lineReader[i].charAt(length - 1) == end){
                        printAgain = false;
                        System.out.print("-------------------------------------------\n");
                        System.out.print("closing note... \n\n");
                        i = 9;
                        cont = false;
                    }
                }

                if(i > 8 && printAgain == true){
                    System.out.print("-------------------------------------------\n");
                    System.out.print("closing note... \n\n");
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


        int priority;
        System.out.println("What is the priority of this task: \n");
        System.out.println("[1] High");
        System.out.println("[2] Medium");
        System.out.println("[3] Low");
        System.out.println("[4] No Priority \n");
        System.out.print("#: ");
        priority = input.nextInt();
        if(priority > 4){
            errorReturn("not an option task priority not set!");
        } else {
            priority(names, counter, priority);
        }

        



        //System.out.print("\n\n" + names[counter - 1][1] + " (names array)");
        

        //System.out.println(names[counter - 1][0]);
        //System.out.println(names[counter - 1][1]);

        //System.out.println(names[counter - 1][1]);
        //int mutCounter = (counter -= counter);
        //System.out.println(mutCounter);
        //names[1][0] = value;
        
    }



    public static void edit(String[][] names){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int notNull = 0;
        String value;
        for(int i = 0; i < names.length; i++){
            if(names[i][0] != null){
                notNull++;
            }
            if(names[i][0] == null){
                counter++;
            }
        }
        if(notNull <= 0){
            errorReturn("You have no tasks");
        }
        for(int k = 0; k < notNull; k++){
            int newCount = counter - 1;
            int space = 10;
            System.out.print(k + 1);
            System.out.print(" | Title: ");
            System.out.print(names[k + counter][0]);
            printSpace(space - names[k + counter][0].length());
            
        }
        System.out.print("Enter the name of the task you would like to edit: ");
        value = input.nextLine();

        int validCount = 0;
        int invalidCount = 0;

        for(int j = 0; j < notNull; j++){
            String compare = names[counter - j][0];
            
            if(value.length() == compare.length()){
                
                for(int l = 0; l < compare.length(); l++){
                    if(compare.charAt(l) == value.charAt(l)){
                        
                        validCount++;
                    } else {
                        
                        invalidCount++;
                    }
                }
                //System.out.print(validCount);
                //System.out.print(invalidCount);
                if(validCount >= compare.length()){
                    System.out.print(j + counter);
                    System.out.print("this name is valid and can be edited");
                    editId(j + counter, names);
                } else {
                    errorReturn("This name does not exist");
                }
            } else {
                errorReturn("This name does not exist");
            }
        }

    }
    public static void editId(int editid, String[][] names){
        System.out.println(names[editid][0]);
        //System.out.println(names[editid][1]);
    }
    public static void execute(int number, String[][] names){
        switch (number){
            case 0:
                create(names);
                break;
            case 1:
                edit(names);
                break;
            case 2:
                list(names);
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
        if(value > 3){
            errorReturn("not found");
            mainMenu(false, names);
        }

      

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
        if(listCount == 0 || listCount < 1){
            errorReturn("you must have more than 1 task!");
            System.exit(0);
        }
        String[][] table = new String[listCount][4];
        return table;

    }

    public static void priority(String[][] names, int counter, int input){
        int counterPrint = counter - 1;
        switch(input){
            case 1:
                System.out.println("priority has been set to high on task: " + counterPrint);
                names[counter - 1][2] = "[1]";
                break;
            case 2: 
                System.out.println("priority has been set to Medium on task: " + counterPrint);
                names[counter - 1][2] = "[2]";
                break;
            case 3: 
                System.out.println("priority has been set to Low on task: " + counterPrint);
                names[counter - 1][2] = "[3]";
                break;
            case 4:
                System.out.println("priority has been set to No Priority on task: " + counterPrint);
                names[counter - 1][2] = "[4]";
                break;
        }
    }

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        
        String[][] table = start();

        printTitle("To Do List", true);
        mainMenu(true, table);

        
        

    }
}