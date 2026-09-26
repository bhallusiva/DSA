class Solution {
    private boolean isSafe(int row,int col,char[][] board,int n)
    {
        int rowDup = row;
        int colDup = col;
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            row--;
            col--;
        }
        row = rowDup;
        col = colDup;
        while(col>=0 && row < n)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            row++;
            col--;
        }
        row = rowDup;
        col = colDup;
        while(col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            col--;
        }
        return true;
    }
    private void solve(int col,char[][] board,List<List<String>> ans, int n)
    {
        List<String> temp =  new ArrayList<>();
        if(col==n)
        {
            for(int i = 0; i<n;i++)
            {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int row = 0;row<n;row++)
        {
            if(isSafe(row,col,board,n))
            {
                board[row][col] = 'Q';
                solve(col+1,board,ans,n);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i = 0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        solve(0,board,ans,n);
        return ans;
    }
}