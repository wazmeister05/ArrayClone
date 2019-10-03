public class ArrayCloneApp {

    int[][] original = new int[10][5];

    public int[][] appClone(){
        int[][] backup = new int[10][5];
        for (int i = 0; i < original.length; i++){
            backup[i] = original[i].clone();    //clone() makes a true clone and not just a copy
                                                //copying just adds the reference which will change with the original
        }
        return backup;
    }

}
