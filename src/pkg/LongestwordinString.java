package pkg;



public class LongestwordinString {

	public static void main(String[] args) {
		 String s= "Today is the happiest day of my life by vijayakumar";
         String [] word = s.split(" ");
        String maxlethWord = "";
        for(int i = 0; i < word.length; i++)
        {
          if(word[i].length() >= maxlethWord.length()){
                maxlethWord = word[i];
          } 
  }
   System.out.println("Longhest Word in String:- "+maxlethWord); 
//   
//   int []a= {12,32,23,45,65,56};
//	int max=0;
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]>max)
//		{
//			max=a[i];
//		}
//	}
//	System.out.println(max);
	}
	
	

}
