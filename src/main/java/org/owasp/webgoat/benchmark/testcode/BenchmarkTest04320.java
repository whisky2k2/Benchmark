/**
* OWASP WebGoat Benchmark Edition (WBE) v1.1
*
* This file is part of the Open Web Application Security Project (OWASP)
* WebGoat Benchmark Edition (WBE) project. For details, please see
* <a href="https://www.owasp.org/index.php/WBE">https://www.owasp.org/index.php/WBE</a>.
*
* The WBE is free software: you can redistribute it and/or modify it under the terms
* of the GNU General Public License as published by the Free Software Foundation, version 2.
*
* The WBE is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
* even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details
*
* @author Nick Sanidas <a href="https://www.aspectsecurity.com">Aspect Security</a>
* @created 2015
*/

package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest04320")
public class BenchmarkTest04320 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = "";
		java.util.Enumeration<String> names = request.getParameterNames();
		if (names.hasMoreElements()) {
			param = names.nextElement(); // just grab first element
		}
		
		
		// Chain a bunch of propagators in sequence
		String a88414 = param; //assign
		StringBuilder b88414 = new StringBuilder(a88414);  // stick in stringbuilder
		b88414.append(" SafeStuff"); // append some safe content
		b88414.replace(b88414.length()-"Chars".length(),b88414.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map88414 = new java.util.HashMap<String,Object>();
		map88414.put("key88414", b88414.toString()); // put in a collection
		String c88414 = (String)map88414.get("key88414"); // get it back out
		String d88414 = c88414.substring(0,c88414.length()-1); // extract most of it
		String e88414 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d88414.getBytes() ) )); // B64 encode and decode it
		String f88414 = e88414.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String bar = thing.doSomething(f88414); // reflection
		
		
		Object[] obj = { "a", bar };
		
		response.getWriter().format(java.util.Locale.US,"notfoo",obj);
	}
}