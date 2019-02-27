public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
    for(int r = 0; r < board.length; r++){
      for(int c =0; c < board[0].length; c++){
        board[r][c]=0;
      }
    }
  }
  private boolean addQueen(int r, int c){
    if(board[r][c] != 0){
      return false;
    }
    board[r][c] = -1;
    for(int row = 0; row < board.length; row++){
      for(int col = c+1; col < board[0].length; col++){
        if(row == r){
          board[r][col]++;
        }
        if(col == r - row + c){
          board[row][col]++;
        }
        if(col == row - r + c){
          board[row][col]++;
        }


      }

    }
    return true;
}
  private void removeQueen(int r, int c){
    board[r][c] = 0;
    for(int row = 0; row < board.length; row++){
      for(int col = c+1; col < board[0].length; col++){
        if(row == r){
          board[r][col]--;
        }
        if(col == r - row + c){
          board[row][col]--;
        }
        if(col == row - r + c){
          board[row][col]--;
        }


      }

    }

  }
  public String toString(){
    String ans = "";
   for(int r = 0; r < board.length; r++){
     for(int c =0; c < board[0].length; c++){
       if(board[r][c] == -1){
        ans += "Q ";
      }
      else{ans += "_ ";}

     }
     ans += '\n';
   }
   return ans;
  }


  public boolean check(){
    for(int r = 0; r < board.length; r++){
      for(int c =0; c < board[0].length; c++){
        //if(board[r])
      }
    }
    return false;
  }
  public boolean solve(){
        for (int[] row: board) {
            for (int value : row ) {
                if (value != 0){
                    throw new IllegalStateException();
                }
            }
        }
        return solveH(0,0,false);
    }
    public boolean solveH(int row, int col, boolean remove){
        if (remove){
            removeQueen(row, col-1);
        }
        if (row < board.length){
            if (col < board.length){
                if (addQueen(row,col)){
                    return solveHelp(row + 1, 0, false) || solveHelp(row, col + 1, true);
                }
                return solveHelp(row, col + 1, false);
            }
            return false;
        }
        return true;
    }
    public int countSolutions(){
        for (int[] row: board) {
            for (int value : row ) {
                if (value != 0){
                    throw new IllegalStateException();
                }
            }
        }
        return countH(0,0,false);
    }
    public int countH(int row, int col, boolean remove){
        if (remove){
            removeQueen(row, col-1);
        }
        if (row < board.length){
            if (col < board.length){
                if (addQueen(row,col)){
                    return countHelp(row + 1, 0, false) + countHelp(row, col + 1, true);
                }
                return countHelp(row, col + 1, false);
            }
            return 0;
        }
        return 1;
    }
  public static void main(String[] args) {
    QueenBoard test = new QueenBoard(4);
     System.out.println(test.addQueen(1, 1));

     System.out.println(test.toString());
     System.out.println(test.addQueen(3, 0));
     System.out.println(test.toString());
     test.removeQueen(1, 1);
     System.out.println(test.toString());


   }
}
