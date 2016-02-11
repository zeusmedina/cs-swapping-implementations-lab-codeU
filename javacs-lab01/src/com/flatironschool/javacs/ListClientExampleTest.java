/**
 * 
 */
package com.flatironschool.javacs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author downey
 *
 */
public class ListClientExampleTest {

	/**
	 * Test method for {@link com.flatironschool.javacs.ListClientExample}.
	 */
	@Test
	public void testListClientExample() {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		assertTrue(list instanceof ArrayList);
	}

}
