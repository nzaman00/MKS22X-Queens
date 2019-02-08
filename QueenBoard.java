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
     for(int c =0; c < board[0].length; c++){
       if(board[r][c] == 1){
        ans += "Q ";
      }
      if(board[r][c] == 0){ans += "_ ";}
     }
     ans += '\n';
   }
   return ans;
  }

 public static void main(String[] args) {
   QueenBoard test = new QueenBoard(8);
    System.out.println(test.addQueen(3, 4));
    System.out.println(test.toString());
    System.out.println(test.removeQueen(3, 4));
    System.out.println(test.toString());
  }
  public boolean check(){
    for(int r = 0; r < board.length; r++){
      for(int c =0; c < board[0].length; c++){
        if(board[r])
      }
    }
  }
  public boolean solve(){
    int numQueens = 0;
    if(numQueens == board.length -1){
      return true;
    }
    return false;
  }

