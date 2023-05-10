class sort_test {
    public static void main(String arg[]){
        String[][] names = new String[10][1];

        for(int i = 0; i < names.length; i++){
            names[i][0] = null;
        }

        names[3][0] = "the";
        names[2][0] = "the";


        for(int j = 0; j < names.length; j++){
            System.out.println(names[j][0]);
        }
        System.out.print(checkForTitleRename(names, "the", 3));
        
    }
    public static boolean checkForTitleRename(String[][] names, String search, int exclude){
        int[] loopArray = new int[names.length];
        for(int i = 0; i < names.length; i++){
            loopArray[i] = i;
            if(i == exclude){
                loopArray[i] = 500;
            }
        }
        System.out.println("=========");
        for(int j = 0; j < loopArray.length; j++){
            System.out.println(loopArray[j]);
        }
        System.out.println("==========");
        boolean cont = true;
        int whileCount = 0;
        String[][] searchArray = new String[1][1];
        searchArray[0][0] = search;
        boolean found = false;
        while(cont){
            whileCount++;

            if(whileCount == exclude){
                whileCount += 1;
            }
            System.out.println(whileCount);
            if(whileCount >= names.length - 1){
                System.out.println("over");
                cont = false;
            }
            if(names[whileCount][0] == searchArray[0][0]){
                System.out.println("found");
                System.out.println(whileCount);
                found = true; 
                cont = false;
            }
        }
        if(found){
            return true;

        } else {
            return false;
        }
    }
}