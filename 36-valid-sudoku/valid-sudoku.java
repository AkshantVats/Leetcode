class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < board[0].length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(
                        !set.add("Found value "+ board[i][j] +" in row" + i) ||
                        !set.add("Found value "+ board[i][j] +" in column" + j) ||
                        !set.add("Found value "+ board[i][j] +" in subBox" + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}