public class krestiki_noliki{
    String[][] field;
   void new_game (){
       String[][] field = new String[][] {{".",".","."},
                                          {".",".","."},
                                          {".",".","."}};
       String nowPlayer = "X";
   }
   String checkGame(){
       for (int i = 0; i<=3; i++){
           boolean check = true;
           for(int j=0; j<=3; j++){
               if (field[i][j].equals("O")|| field[i][j].equals(".")){
                   check = false;
               }
           }
           if (check) return "X";
       }

       for (int i = 0; i<=3; i++){
           boolean check = true;
           for(int j=0; j<=3; j++){
               if (field[i][j].equals("X")|| field[i][j].equals(".")){
                   check = false;
               }
           }
           if (check) return "O";
       }

       String[] diag = {field[0][0], field[1][1],field[2][2]};
       String[] diag2 = {field[0][2], field[1][1],field[2][0]};

       for (int i=0; i<diag.length; i++){
           boolean check = true;
           if (diag[i].equals("O")||diag[i].equals(".")){
               check = false;
           }else if (check == true){
               return "X";
           }else if (diag[i].equals("X")||diag[i].equals(".")) check = false;
           if(check) return "O";
       }
       for (int i=0; i<diag2.length; i++){
           boolean check = true;
           if (diag[i].equals("O")||diag[i].equals(".")){
               check = false;
           }else if (check == true){
               return "X";
           }else if (diag[i].equals("X")||diag[i].equals(".")) check = false;
           if(check) return "O";
       }
       for (int i = 0; i<3; i++){
           for (int j = 0; j<3; j++){
               if (field[i][j].equals(".")) return null;
           }
       }

       return "Nichia";
   }

}