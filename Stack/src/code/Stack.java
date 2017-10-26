package code;

import java.util.Arrays;

/**
 * @author Thauany Moedano
 * This class implements a simple structure of stack (FIFO)
 */
public class Stack 
{
	private int[] _stack;
	private int[] _minStack;
	private Integer _minValue;
	private int _stackIndex;
	private int _minStackIndex;
	private int _maximumSize;
	public final int EMPTY_STACK = -1;
	
	/**
	 * Constructor of the stack. Initiliaze the stack with the given length.
	 * @param length
	 */
	public Stack(int pLength)
	{
		_maximumSize = pLength;
		_stack = new int[_maximumSize];
		_minStack = new int[_maximumSize];
		_stackIndex = EMPTY_STACK;
		_minStackIndex = EMPTY_STACK;
	}
	
	/**
	 * Add the given number to the top of the stack
	 * @param pNumber
	 */
	public void push(int pNumber)
	{
		
		if(_minValue == null || pNumber <= _minValue)
		{
			_minValue = pNumber;
			_minStack[++_minStackIndex] = pNumber;
		}
		
		if(_stackIndex + 1 < _maximumSize)
		{	
			_stack[++_stackIndex] = pNumber;
		}	
		else
		{
			System.out.println("Full Stack!");
		}
	}

	/**
	 * Remove an element of the stack.
	 * @return the element removed
	 */
	public Integer pop()
	{
		if(_stackIndex != EMPTY_STACK)
		{
			int elementRemoved = _stack[_stackIndex--];
			if(elementRemoved == _minStack[_minStackIndex])
			{
				int minPoped = _minStack[_minStackIndex--];
				if(_minStackIndex != EMPTY_STACK)
				{	
					_minValue = _minStack[_minStackIndex];
				}	
				System.out.println("old minimum element " + minPoped);
			}
			return elementRemoved;	
		}
		else
		{
			System.out.println("Empty Stack!");
			return null;
		}
	}
	
	/**
	 * @return stack of integers.
	 */
	public int[] getStack()
	{
		return _stack;
	}
	
	/**
	 * @return minimum value of the stack.
	 */
	public int getMinValue()
	{
		return _minValue;
	}
	
	/**
	 * @return the index that represent the top of the stack.
	 */
	public int getStackIndex()
	{
		return _stackIndex;
	}
	
	
}
