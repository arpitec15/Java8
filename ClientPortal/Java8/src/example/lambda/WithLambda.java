package example.lambda;

import java.util.ArrayList;
import java.util.List;

public class WithLambda {

	public static void main(String[] args) {
		int width = 10;
		/*
		Drawable d2=(String name)->{  
            System.out.println("Drawing "+ name);  
        };  
        d2.Drawing("Arpit");*/
		
		

		Drawable d2=(String name)->{  
            return "Hi "+ name; 
        };  
       System.out.println(d2.Drawing("Arpit")); 
       
       
       additionOfStrings add = (String name1, String name2)->{
    	   return name1 + " Raj " + name2;
       };
       
       System.out.println(add.addStrings("Arpit", "Srivastava"));
       
       
       
       List<String> list=new ArrayList<String>();  
       list.add("India");  
       list.add("US");  
       list.add("China");  
       list.add("UK");  
         
       list.forEach((n) -> System.out.println("Country -> "+ n));
	}
}
