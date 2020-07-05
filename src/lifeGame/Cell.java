package lifeGame;

public class Cell {

	private int status;   //0-����1-��
	private int num_living;   //��Χ��ϸ����Ŀ
	
	//��ʼ��
	Cell(){
		status = 0;
		num_living = 0;
	}
	
	//��ȡϸ��״̬
	public int getStatus() {
		return status;
	}
	
	//��ȡ��ϸ����Ŀ
	public int getNum_living() {
		return num_living;
	}
	
	//����ϸ��״̬
	public void setStatus(int status2) {
		status = status2;
	}
	
	//���û�ϸ����Ŀ
	public void setNum_living(int num_living2) {
		num_living = num_living2;
	}
	
	//����״̬�仯
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
