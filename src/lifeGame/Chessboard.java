package lifeGame;

import java.util.Random;

public class Chessboard {

	final static public int x = 3;
	final static public int y = 3;
	
	
	public static Cell [][] initial(){
		Cell [][]cell = new Cell[x][y];
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++) {
				cell[i][j] = new Cell();  //初始化细胞
				Random random = new Random();
				cell[i][j].setStatus(random.nextInt(2));   //细胞随机生成0/1的生死状态
			}
		return cell;
	}
	
	//获取邻居的活细胞数
	public static void getNeighbor_living(Cell [][]cell) {
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++)
			{
				int num = 0;
				num += Chessboard.getNum(i, j, cell);
				cell[i][j].setNum_living(num);
			}
	}
	
	//更新细胞状态
	public static int update(Cell [][]cell) {
		int count = 0;
		for(int i=0; i<x; i++)
			for(int j=0; j<x; j++) {
				int status = cell[i][j].getStatus();
				cell[i][j].updateStatus();
				if(status == cell[i][j].getStatus()) {
					count++;
				}
			}	
		return count;
	}
	
	
	public static int getNum(int i, int j, Cell [][]cell) {
		int num = 0;
		if(i>0 && j>0) {
			num += cell[i-1][j-1].getStatus();
		}
		if(i>0) {
			num += cell[i-1][j].getStatus();
		}
		if(j>0) {
			num += cell[i][j-1].getStatus();
		}
		if(i<x-1 && j<x-1) {
			num += cell[i+1][j+1].getStatus();
		}
		if(i<x-1) {
			num += cell[i+1][j].getStatus();
		}
		if(j<x-1) {
			num += cell[i][j+1].getStatus();
		}
		if(i<x-1 && j>0) {
			num += cell[i+1][j-1].getStatus();
		}
		if(i>0 && j<x-1) {
			num += cell[i-1][j+1].getStatus();
		}
		return num;
	}
	
}
