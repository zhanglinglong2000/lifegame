package lifeGame;

public class Time {

	final static public int x = 64;
	final static public int y = 64;
	
    public void start() {
    	long d1= System.currentTimeMillis();
    	int count = 0;
    	while(true)
    	{
    		long d2 = System.currentTimeMillis();
    		if(d2 - d1 > 1000)
    		{
    			d1 = d2;
    			count ++;
    			Gui.jframe.setTitle("ÉúÃüÓÎÏ·--µÚ"+ count + "Ãë");
    			Gui.update();
    		}
    		
    	}
    }
}
