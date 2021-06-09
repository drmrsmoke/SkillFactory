public class Main {


    public static void main(String[] args) {

        massivpz my = new massivpz(new int[]{5,6,7,8,9,10},5,2);
        System.out.println(my.resize());


//        separator r = new separator(new int[]{2, 5, 6, 8, 9, 12});
//        int [] evens = r.evens();
//        int [] odd = r.odd();
//        for (int i=0; i< evens.length; i++){
//            System.out.println(evens[i]);
//        }
//        for (int i=0; i< odd.length; i++){
//            System.out.println("Here is odd num "+odd[i]);
//        }
/*
Make numbers and common name to tanks
*/

//        // At (0;0) fuel=100
//        Tank justTank = new Tank();
//        // At (10;20) fuel=100
//        justTank.goForward(200);
//        justTank.printPosition();
//        Tank anywareTank = new Tank(10, 10);
//        // At (20;30) fuel=200
//        anywareTank.goBackward(-200);
//        anywareTank.printPosition();
//        Tank customTank = new Tank(20, 30, 200);
//        customTank.goForward(201);
//        customTank.printPosition();



/*
This fragment of code has to output

The Tank T34-1 is at 100, 0 now.
The Tank T34-2 is at 110, 10 now.
The Tank T34-3 is at 220, 30 now.

*/
    }

}
