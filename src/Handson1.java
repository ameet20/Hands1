import java.util.*;  
public class Handson1 {
	
	public static void main(String[] args){
		
		 
		int Eng, Math, Scie, Eco, Phy, Total, Percentage;
		
		Scanner in = new Scanner(System.in);  
		   System.out.println("English Marks: "); 
		   Eng = in.nextInt();
		   System.out.println("Mathematics Marks: ");
		   Math = in.nextInt();
		   System.out.println("Science Marks: ");
		   Scie = in.nextInt();
		   System.out.println("Economics Marks: ");
		   Eco = in.nextInt();
		   System.out.println("Physics Marks: ");
		   Phy = in.nextInt();
	Total = Eng + Math + Scie + Eco + Phy;
	Percentage = Total / 5;
	
	if (Percentage < 40){
		System.out.println("Student is poor ");
	}
	else if (Percentage > 40 && 60 < Percentage){
		System.out.println("Student is Average ");
	}
	else if (Percentage > 59 && 80 < Percentage){
		System.out.println("Student is Good ");
	}
	else if (Percentage > 80 && 90 < Percentage){
		System.out.println("Student is Very Good ");
	}
	else if (Percentage >= 90){
		System.out.println("Student is Average ");
	}
 	}	           
	}


