class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = ".";
            }
        }

        nqueen(board, 0);

        return ans;
    }

    public void nqueen(String[][] board, int row){

        if(row == board.length){

            List<String> temp = new ArrayList<>();

            for(int i = 0; i < board.length; i++){
                String s = "";
                for(int j = 0; j < board.length; j++){
                    s += board[i][j];
                }
                temp.add(s);
            }

            ans.add(temp);
            return;
        }

        for(int j = 0; j < board.length; j++){

            if(isSafe(board, row, j)){
                board[row][j] = "Q";
                nqueen(board, row + 1);
                board[row][j] = ".";
            }
        }
    }

    public boolean isSafe(String[][] board, int row, int col){

        for(int i = row - 1; i >= 0; i--){
            if(board[i][col].equals("Q")){
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j].equals("Q")){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j].equals("Q")){
                return false;
            }
        }

        return true;
    }
}