package org.web.app.models;
import java.util.ArrayList;

public class RandomGenerator {

	private ArrayList<Integer> randomArray;
	
	public RandomGenerator() {
		
	}
	
	public RandomGenerator(int size) {	
		    randomArray=new ArrayList<>();
			generateNoArray(size);
	}
			
	public int generateNoArray(int size) {
		 
		Long seed; int randNo;float tempRandNo;
		   
		   for(int i=0;i<size;i++) {	
			   seed=System.nanoTime();	
			   tempRandNo = ((seed * 25173 + 13849) %101);
			   tempRandNo=(tempRandNo/101);
			   randNo=(int) (100*tempRandNo+0);
			   System.out.println(randNo);	
			   randomArray.add(randNo);		   
		   }   
	return 0;
	}
	
	
	public ArrayList<Integer> getRandomArray() {
		return this.randomArray;
	}
	
	
	
//Obsolete Code	
	/*public int generateNoArray(int size) {
		   int firstLoop, secondLoop;Long time;
		    for ( firstLoop=1; firstLoop<=20; ++firstLoop ) {
		        for ( secondLoop=1; secondLoop<=20; ++secondLoop ) {
		        		//int value = (20*firstLoop) + (secondLoop - 21);
		        			time=System.nanoTime();	
		        		    time=(time%400)+1;
		        			long randomValue=myRand(time,size);
		                                
		                 	if(randomArray.size()<size) {
		                 	   System.out.println("No is"+ randomValue); 
		                 		randomArray.add((int) randomValue);
		                 	}                
		                 else {
		                	 System.out.println ("Size"+randomArray.size());
		                	 return 0;
		                 }                	
		         }
		     }
		    return 0;
		}
	
	public long myRand(long value,int size) {
		     //if ((value < 401)) {
			if(value>100) {
	             return (value%100) + 1;
	           }
	         else {
	           return generateNoArray(size);
	         }
		}*/
	
	
	
	
}
