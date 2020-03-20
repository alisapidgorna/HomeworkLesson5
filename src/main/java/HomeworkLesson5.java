public class HomeworkLesson5 {
    public static void main(String[] args) {
        int[][] second = {{4,7,9,33},
                          {4,97,5,5},
                          {9,9,79,3},
                          {39,6,7,6}};

        char [][] array = new char[4][4];
        array[0][0] = 'A';
        array[0][1] = 'L';
        array[0][2] = 'I';
        array[0][3] = 'S';
        array[1][0] = 'A';
        array[1][1] = 'P';
        array[1][2] = 'I';
        array[1][3] = 'D';
        array[2][0] = 'G';
        array[2][1] = 'O';
        array[2][2] = 'R';
        array[2][3] = 'N';
        array[3][0] = 'A';
        array[3][1] = 'U';
        array[3][2] = 'K';
        array[3][3] = 'R';
        System.out.print(array[0][0]);
        System.out.print(array[0][1]);
        System.out.print(array[0][2]);
        System.out.print(array[0][3]);
        System.out.print(array[1][0]+ "  ");
        System.out.print(array[1][1]);
        System.out.print(array[1][2]);
        System.out.print(array[1][3]);
        System.out.print(array[2][0]);
        System.out.print(array[2][1]);
        System.out.print(array[2][2]);
        System.out.print(array[2][3]);
        System.out.print(array[3][0] + "  ");
        System.out.print(array[3][1]);
        System.out.print(array[3][2]);
        System.out.print(array[3][3]);
        System.out.println();

        for(int f=0; f<second.length; f++){
            for(int t=0; t< second[f].length; t++){
                System.out.print(second[f][t] + "  ");
            }
            System.out.println();
        }
    }
}
