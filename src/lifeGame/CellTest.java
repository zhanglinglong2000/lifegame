package lifeGame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
private static Cell cell = new Cell();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetStatus() {
		cell.setStatus(0);
		assertEquals(0,cell.getStatus());
		cell.setStatus(1);
		assertEquals(1,cell.getStatus());
	}

	@Test
	public void testSetNum_living() {
		for(int i=0; i<=8; i++)
		{
			cell.setNum_living(i);
			assertEquals(i,cell.getNum_living());
		}
	}

	@Test
	public void testUpdateStatus() {
		for(int i=0; i<=8; i++)
		{
		   cell.setNum_living(i);
			for(int j = 0; j <= 1; j ++)
			{
				cell.setStatus(j);  //ǰ״̬
				cell.updateStatus();
				if(i == 2) assertEquals(j,cell.getStatus());
				else if(i == 3)  assertEquals(1, cell.getStatus());
				else   assertEquals(0, cell.getStatus());
			}
		}
	}

}
