/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "Say something, please.";
		
		if (statement.trim().length() == 0) {
			return response;
		}
		else if(statement.contains("Mauro")) {
			response = "I hear he's a great teacher! Doesn't he teach AP Comp Sci A? Wait... isn't this FOR AP Comp Sci A?";
		}
		else if(statement.contains("dog") ||statement.contains("cat")) {
			response = "Tell me more about your pets.";
		}
		else if (statement.contains("Star Wars") || statement.contains("IN-N-OUT")) {
			response = "You, my friend, have taste.";
		}
		else if (statement.contains("Python")) {
			response = "Now we're talking";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		switch (whichResponse) {
			case 0: {
				response = "Interesting, tell me more.";
			}
			case 1: {
				response = "Hmmm.";
			}
			case (2):
			{
				response = "Do you really think so?";
			}
			case (3):
			{
				response = "You don't say.";
			}
			case (4):
			{
				response = "Cool. I didn't really ask, but sure";
			}
			case (5):
			{
				response = "Why are you talking to a bot anyways?";
			}
			
		}
		

		return response;
	}
}
