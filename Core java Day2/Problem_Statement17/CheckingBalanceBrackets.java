package Problem_Statement17;

// Java program for the above approach.
class CheckingBalanceBrackets{

// Function to check
// if parentheses are balanced
public static boolean isBalanced(String exp)
{
	
	// Initialising variables
	boolean flag = true;
	int count = 0;
	
	// Traversing the expression
	for(int i = 0; i < exp.length(); i++)
	{
		if (exp.charAt(i) == ')')
		{
			count++;
		}
		else
		{
			
			// It is a closing parenthesis
			count--;
		}
		if (count < 0)
		{
			
			// This means there are
			// more Closing parenthesis
			// than opening ones
			flag = false;
			break;
		}
	}
	
	// If count is not zero,
	// It means there are
	// more opening parenthesis
	if (count != 0)
	{
		flag = false;
	}
	return flag;
}

// Driver code
public static void main(String[] args)
{
	String exp1 = "[()]{}{[()()]()}";
	
	if (isBalanced(exp1))
		System.out.println("Not Balanced");
	else
		System.out.println("Balanced");
	
	String exp2 = "[(])}";
	
	if (isBalanced(exp2))
		System.out.println("Balanced");
	else
		System.out.println("Not Balanced");
}
}

// This code is contributed by divyeshrabadiya07
