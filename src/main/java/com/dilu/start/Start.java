package com.dilu.start;

import com.dilu.test.TestGithub;

public class Start {

	public static void main(String[] args) {
		TestGithub test = new TestGithub();
		test.setEmpNo(111);
		test.setEmpName("Dillip kumar sahoo");
		System.out.println(test.getEmpName());
		System.out.println(test.getEmpNo());

	}

}
