package assignment;

public class CountWords {

	public static void main(String[] args) {
     String str="Java is used to develop mobile apps, web apps, desktop apps, games and much more";
     int strLength=str.length();
    System.out.println("String length is : "+strLength);
    
    String[] splitW=str.split(" ");  //split the string using empty string delimiter
    for(int i=0;i<splitW.length;i++)  
    {
    	System.out.println(splitW[i]);
    	
    }
   
    System.out.println("The total number of words in this String is :" +splitW.length);  
	}

}
