package lifeGame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChessboardTest {
	final static public int x = 3;
	final static public int y = 3;
	private static Cell [][]cell = new Cell[x][y];
	
	@Before
	public void setUp() throws Exception {
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++)
			{
				cell[i][j] = new Cell();
			}
	}

	@Test
	public void testGetNeighbor_living() {
		dfs1(0, 0);
	} 

	@Test
	
	public void testUpdate() {
		dfs2(0, 0);
		
	}
   public void dfs1(int i, int j)
   {
	   if(i == 2 && j == 3)
	   {
		   Chessboard.getNeighbor_living(cell);
		   for(int u=0; u<x; u++)
			 for(int v=0; v<y; v++)
			{
					int num = 0;
					num = Chessboard.getNum(u, v, cell);
				assertEquals(num, cell[u][v].getNum_living());
			}
		   return;
	   }
	   if(j == 3) { dfs1(i + 1, 0); return;}
	   cell[i][j].setStatus(1);
	   dfs1(i, j + 1);
	   cell[i][j].setStatus(0);
	   dfs1(i, j + 1);
	   return;
   }
   
   public void dfs2(int i, int j)
   {
	   if(i == 2 && j == 3)
	   {
		   Chessboard.update(cell);
		   Chessboard.getNeighbor_living(cell);
		   for(int u=0; u<x; u++)
			 for(int v=0; v<y; v++)
			{
					int num = 0;
					num = Chessboard.getNum(u, v, cell);
				assertEquals(num, cell[u][v].getNum_living());
			}
		   return;
	   }
	   if(j == 3) { dfs1(i + 1, 0); return;}
	   cell[i][j].setStatus(1);
	   dfs2(i, j + 1);
	   cell[i][j].setStatus(0);
	   dfs2(i, j + 1);
	   return;
   }
}