public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
  }
  private boolean addQueen(int r, int c){
    board[r][c] = 1;
    return true;
  }
  private boolean removeQueen(int r, int c){
    if(board[r][c] == 1){
      board[r][c] = 0;
      return true;
    }
    return false;
  }
  public String toString(){
    String ans = "";
   for(int r = 0; r < board.length; r++){
     for(int c =0; c < board[0].length){
       if(board[r][c] == 1){
        ans += "Q ";
      }
      ans += "_ ";
     }
     ans += '\n'
   }
   return ans;
  }

}

