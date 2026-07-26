class star1{
    public static void main(String args[]){
        int star[][]=new int [5][];
        star [0] = new int [1];
        star [1] = new int [2];
        star [2] = new int [3];
        star [3] = new int [4];
        star [4] = new int [5];
        for (int i = 0 ; i<star.length ; i++){
            for (int j=0 ; j<star[i].length ; j++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}