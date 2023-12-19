
public class StatementElseIf {
	public static void main(String[] args) {
		//grading system
	int percentage =90;
	if(percentage >=90 && percentage <=100){// f && f ==>f
		//executes if condition1 is true
		System.out.println("A+");
		}
		else if(percentage >=70 && percentage <=90){//t && t ==>t
		//executes if condition1 to be false condition2 is true
			System.out.println("A");
		}
		else if(percentage >=50 && percentage <70){//f && f==>f
		//executes if condition1,condition2 to be false condition3 is true
		System.out.println("B");
		}
		else{
		//execute if all the above conditions(condition1,condition2,conditionn3) is false
		System.out.println("better luck next time");
		}
	//if any one of the above if elseif and else block executes it will reach out of the else block
	System.out.println("out of it");
	}
//	char dept ='a';
//	if((dept == 'a' && dept =='b') || (dept =='c' && dept =='d')) {
//		
//	}
	
}
