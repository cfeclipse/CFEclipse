/*
 * Created on Mar 23, 2004
 *
 * The MIT License
 * Copyright (c) 2004 Oliver Tupman
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software 
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package com.rohanclan.cfml.parser;

/**
 * 
 * @author Oliver Tupman
 *
 * Reprents a parser error.
 * An error can be set to be fatal which means that 
 */
public class ParseError extends ParseMessage {
	/**
	 * @param lineNum
	 * @param docStart
	 * @param docEnd
	 * @param data
	 * @param msg
	 */
	public ParseError(int lineNum, int docStart, int docEnd, String data,
			String msg) 
	{
		super(lineNum, docStart, docEnd, data, msg);
	}
	/**
	 * @param lineNum
	 * @param docStart
	 * @param docEnd
	 * @param data
	 * @param msg
	 * @param fatal
	 */
	public ParseError(int lineNum, int docStart, int docEnd, String data,
			String msg, boolean fatal) 
	{
		super(lineNum, docStart, docEnd, data, msg, fatal);
	}

}