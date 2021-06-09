public class separator {
    int [] array;

    public separator(int[] array) {
        this.array = array;
    }
    private int even(){
       int k=0;
       for (int i :array){
           if (i%2==0){
               k++;
           }
       }
       return k;
    }
    int [] evens(){
        int [] my = new int[even()];
        int k =0;
        for (int i: array){
            if (i%2==0){
                my[k] =i;
                k++;
            }
        }
        return my;
    }

    private int odd_l(){
        int num = 0;
        for (int i:array){
            if (i%2!=0){
                num++;
            }
        }
        return num;
    }

    int [] odd(){
        int k =0;
        int [] my2 = new int [odd_l()];
        for (int i=0; i<array.length; i++){
            if (array[i]%2!=0){
                my2[k]=array[i];
                k++;
            }
        }
        return my2;
    }


}

