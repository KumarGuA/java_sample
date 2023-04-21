package javaBasicsDay1;

public class PujithaOperatorsAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Unary
		int a=10, b=5;
		int preInc = ++a, postInc = b++, preDec = --a, postDec = b--;
		System.out.println("Unary Operators:- PreIncrement: "+preInc+" , PostIncrement: "+postInc+" , PreDecrement: "+preDec+" , PostDecrement: "+postDec);
		
		//Arithmetic
		int add = a+b, sub=a-b, product = a*b, div = a/b, rem = a%b;
		System.out.println("Arithmetic Operators:- Addition: "+add+" , Subtraction: "+sub+" , Product: "+product+" , Quotient: "+div+" , Remainder: "+rem);

		//Relational
		boolean isGreater = a>b, isLesser = a<b, isGreaterEqual = a>=b, isLesserEqual = a<=b, isEqual = (a==b), isNotEqual = (a!=b) ;
		System.out.println("Relational Operators:- GreaterThan: "+isGreater+" , LessThan: "+isLesser+" , GreaterThanEqual: "+isGreaterEqual+" , LessThanEqual: "+isLesserEqual+" , Equals: "+isEqual+" , NotEquals: "+isNotEqual);
		
		//Logical
		boolean condition1 = true, condition2=false, andOp = (condition1 && condition2), orOp = (condition1 || condition2);
		System.out.println("Logical Operators:- Logical AND: "+andOp+" , Logical OR: "+orOp);
		
		//Ternary
		String ternaryResult = (a>b)?"True":"False";
		System.out.println("Ternary Operator:- "+ternaryResult);
		
		//Assignment
		System.out.println("Assignment Operators:- +=: "+(a +=b)+" , -=: "+(a-=b)+" , /=: "+(a/=b)+" , *=: "+(a*=b));

	}

}
