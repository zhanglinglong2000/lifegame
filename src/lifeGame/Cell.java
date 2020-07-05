package lifeGame;

public class Cell {

	private int status;   //0-死；1-生
	private int num_living;   //周围活细胞数目
	
	//初始化
	Cell(){
		status = 0;
		num_living = 0;
	}
	
	//获取细胞状态
	public int getStatus() {
		return status;
	}
	
	//获取活细胞数目
	public int getNum_living() {
		return num_living;
	}
	
	//设置细胞状态
	public void setStatus(int status2) {
		status = status2;
	}
	
	//设置活细胞数目
	public void setNum_living(int num_living2) {
		num_living = num_living2;
	}
	
	//更新状态变化
	public void updateStatus() {
		
		int n = this.getNum_living();
		switch(n)
		{
		case 2:
		{
			this.setStatus(this.status);
			break;
		}
		case 3:
		{
			this.setStatus(1);
			break;
		}
		default:
		{
			this.setStatus(0);
			break;
		}
		}
	}
}
