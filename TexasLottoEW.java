// Evan White
import java.util.Random;
import java.util.Calendar;
public class TexasLottoEW
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		//rand.setSeed(12345);
		
		long begin = System.currentTimeMillis();
		//System.out.println ("Begin      " + begin);

		int tex1, tex2, tex3, tex4, tex5, tex6;
		int my1, my2, my3, my4, my5, my6;
		int counter = 0;
        int match = 0;
// Part 1
		    tex1=rand.nextInt(54) + 1;   

		do
		{
			tex2 = rand.nextInt(54) + 1;   
		}while (tex2 == tex1);
		
        do
        {
	        tex3 = rand.nextInt(54) + 1;
	
        }while(tex3 == tex2 || tex3 == tex1);
        
        do
        {
        	tex4= rand.nextInt(54) + 1;
        }while(tex4 == tex3 || tex4 == tex2 || tex4 == tex1);
        
        do
        {
        	tex5 = rand.nextInt(54) + 1;
        }while(tex5 == tex4 || tex5 == tex3 || tex5 == tex2 || tex5 == tex1);
        
        do
        {
        	tex6 = rand.nextInt(54) + 1;
        }while(tex6 == tex5 || tex6 == tex4 || tex6 == tex3 || tex6 == tex2 || tex6 == tex1);
        System.out.print("Random Numbers:    ");
       System.out.println(tex1 + " " + tex2 + " " + tex3 + " " + tex4 + " " + tex5 + " " + tex6);
        
        // Part 2
        do{
        {
        
            my1=rand.nextInt(54) + 1;   

		do
		{
			my2 = rand.nextInt(54) + 1;   
		}while (my2 == my1);
		
        do
        {
	        my3 = rand.nextInt(54) + 1;
	
        }while(my3 == my1 || my3 == my2);
        
        do
        {
        	my4= rand.nextInt(54) + 1;
        }while(my4 == my3 || my4 == my2 || my4 == my1);
        
        do
        {
        	my5 = rand.nextInt(54) + 1;
        }while(my5 == my4 || my5 == my3 || my5 == my2 || my5 == my1);
        
        do
        {
        	my6 = rand.nextInt(54) + 1;
        }while(my6 == my5 || my6 == my4 || my6 == my3 || my6 == my2 || my6 == my1);
        
        
// Part 3
        
        match = 0;
        
        if(tex1 == my1 || tex1 == my2 || tex1 == my3 || tex1 == my4 || tex1 == my5 || tex1 == my6)
        match++;
        
        if(tex2 == my1 || tex2 == my2 || tex2 == my3 || tex2 == my4 || tex2 == my5 || tex2 == my6)
        match++;
        
        if(tex3 == my1 || tex3 == my2 || tex3 == my3 || tex3 == my4 || tex3 == my5 || tex3 == my6)
        
        match++;
        
        if(tex4 == my1 || tex4 == my2 || tex4 == my3 || tex4 == my4 || tex4 == my5 || tex4 == my6)
        match++;
        
        if(tex5 == my1 || tex5 == my2 || tex5 == my3 || tex5 == my4 || tex5 == my5 || tex5 == my6)
        match++;
        
        if(tex6 == my1 || tex6 == my2 || tex6 == my3 || tex6 == my4 || tex6 == my5 || tex6 == my6)
        match++;
        
        }counter++;
	}while(match != 6);
        long end = System.currentTimeMillis();
		   //System.out.println ("End        " + end);
           System.out.println("Time lapsed : " + (end-begin));
           System.out.println("Match: " + match);
           System.out.print("My Numbers :       ");
           System.out.println(my1 + " " + my2 + " " + my3 + " " + my4 + " " + my5 + " " + my6);
           System.out.println("Counter:" + counter);
	}
	
}