/**
 * THIS CLASS IS PROVIDED TO YOU. DO NOT MODIFY IT.
 *
 * Class to provided testing utility. Mimics Junit4's org.junit.Assert. Used in place
 * of Junit4 due to its incompatibility with Zylabs. Provides assertion utility for
 * ints, doubles, and objects (assumes the equals method is overriden).
 *
 * @author Stephen
 * @version 2019-02-06
 */
public class Assert
{
	/**
	 * Asserts that two values are equal. Throws an exception if they are not equal.
	 * If an AssertException is thrown the test has failed. The test or code should
	 * be amended to that no AssertExceptions are thrown.
	 *
	 * Several overrides are given to compare different data types.
	 *
	 * int comparisons are simple.
	 *
	 * @param expected The excepted value.
	 * @param actual The actual value.
	 * @throws AssertException Thrown if the expected value does not match the actual
	 * value.
	 */
	public static void assertEquals(int expected, int actual) throws AssertException
	{
		if (expected != actual)
		{
			String errorMessage = String.format("\n*******************************"
					+ "\n*** Test Results: *************"
					+ "\n*******************************\n"
					+ "Equality Error!\nExpected: %d\nActually: %d\n", expected, actual);
			throw new AssertException(errorMessage);
		}
	}

	/////////////////////
	// Override variants:
	/////////////////////
	/**
	 * Asserts that two values are equal. Throws an exception if they are not equal.
	 * If an AssertException is thrown the test has failed. The test or code should
	 * be amended to that no AssertExceptions are thrown.
	 *
	 * Several overrides are given to compare different data types.
	 *
	 * Floating point values should be tested to be equal within a certain delta
	 * tolerance. Often times floating point arithmetic will lead to some data loss, as
	 * the numbers cannot be perfectly represented due to bit limits (e.g. 1/3 or 0.3333333...).
	 * As such, two numbers may have the same operations done (*2, /4, *5) and should be
	 * equal, but due to losing some data they are not (5.000000000 vs. 5.0000000001). Using
	 * a delta value compares two numbers while accounting for data loss (5.000000000 is within
	 * 0.00001 of 5.0000000001, delta = 0.00001).
	 *
	 * @param expected The excepted value.
	 * @param actual The actual value.
	 * @param delta The allowable difference between the double values.
	 * @throws AssertException Thrown if the expected value does not match the actual value.
	 */
	public static void assertEquals(double expected, double actual, double delta) throws AssertException
	{
		if (Math.abs(expected - actual) > delta)
		{
			String errorMessage = String.format("\n*******************************"
					+ "\n*** Test Results: *************"
					+ "\n*******************************\n"
					+ "Equality Error!\nExpected: %f\nActually: %f\n"
					+ "Should be equal within a range of %f\n", expected, actual, delta);
			throw new AssertException(errorMessage);
		}
	}

	/**
	 * Asserts that two values are equal. Throws an exception if they are not equal.
	 * If an AssertException is thrown the test has failed. The test or code should
	 * be amended to that no AssertExceptions are thrown.
	 *
	 * Several overrides are given to compare different data types.
	 *
	 * This assertion relies on the equality method programmed into the objects.
	 *
	 * @param expected The excepted value.
	 * @param actual The actual value.
	 * @throws AssertException Thrown if the expected value does not match the actual value.
	 */
	public static void assertEquals(Object expected, Object actual) throws AssertException
	{
		if (!expected.equals(actual) || !actual.equals(expected))
		{
			String errorMessage = String.format("\n*******************************"
					+ "\n*** Test Results: *************"
					+ "\n*******************************\n"
					+ "Equality Error!\nExpected: %s\nActually: %s\n",
					expected.toString(), actual.toString());
			throw new AssertException(errorMessage);
		}
	}
}
