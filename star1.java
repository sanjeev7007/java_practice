class star1{
    public static void main(String args[]){
        int star[][]=new int [5][];
        for (int i=0;i<=4;i++){
                star [i] = new int [i+1];   
        }
        
        for (int i = 0 ; i<star.length ; i++){
            for (int j=0 ; j<star[i].length ; j++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}