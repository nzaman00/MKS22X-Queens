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
    int numQueens = 0;
    if(numQueens == board.length -1){
      return true;
    }
    return false;
  }
  public boolean solveH(int col, int numQueens){
    for(int r = 0; r < board.length; r++){

    }
    return false;
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
