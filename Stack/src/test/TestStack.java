package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Stack;

public class TestStack 
{
	public final int STACK_SIZE = 4;
	
	/**
	 * test if push a new element to the stack works correctly. 
	 */
	@Test
	public void testPushElements()
	{
		Stack stackTest = new Stack(STACK_SIZE);
		stackTest.push(3);
		int[] stackElements = stackTest.getStack();
		assertEquals(stackElements[0], 3);
	}
	
	/**
	* test if the stack return the correct minimun value
	*/
	@Test
	public void testMinimumValue()
	{
		Stack stackTest = new Stack(STACK_SIZE);
		stackTest.push(2);
		stackTest.push(4);
		stackTest.push(1);
		stackTest.push(5);
		int minimumValue = stackTest.getMinValue();
		assertEquals(minimumValue, 1);
	}
	
	/**
	* Test if push more items than the capacoty of stack allow than the elements are not pushed.
	*/
	@Test
	public void testMaximumSizeRestriction()
	{
		Stack stackTest = new Stack(STACK_SIZE);
		stackTest.push(3);
		stackTest.push(5);
		stackTest.push(8);
		stackTest.push(10);
		stackTest.push(1);
		int top = stackTest.getStackIndex();
		int[] stack = stackTest.getStack();
		assertEquals(stack[top], 10);
	}
	
	/*
	* Test if popping an element from the stack works correctly
	*/
	@Test
	public void testPopElement()
	{
		Stack stackTest = new Stack(STACK_SIZE);
		stackTest.push(4);
		stackTest.push(7);
		stackTest.push(5);
		stackTest.pop();
		int top = stackTest.getStackIndex();
		int[] stack = stackTest.getStack();
		assertEquals(stack[top], 7);
	}
	
	/*
	* Test if stack knows how to handle when try to pop element of en empty list
	*/
	@Test
	public void testEmptyStackRestriction()
	{
		Stack stackTest = new Stack(STACK_SIZE);
		stackTest.push(4);
		stackTest.push(6);
		stackTest.pop();
		stackTest.pop();
		stackTest.pop();
		int top = stackTest.getStackIndex();
		assertEquals(top, -1);
	}
	
	/*
	* Test if the stack return the correctly minimun value after popping the first minimum value of the stack
	*/
	@Test
	public void testMinValueAfterPop()
	{
		Stack stackTest = new Stack(STACK_SIZE);
		stackTest.push(3);
		stackTest.push(2);
		stackTest.push(1);
		stackTest.push(5);
		stackTest.pop();
		stackTest.pop();
		int minValue = stackTest.getMinValue();
		assertEquals(minValue, 2);
	}
	
	
}
