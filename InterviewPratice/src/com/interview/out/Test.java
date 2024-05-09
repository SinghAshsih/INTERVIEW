package com.interview.out;

import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test extends FilterOutputStream
implements Appendable, Closeable{

	public Test(OutputStream out) {
		super(out);
		
	}

	@Override
	public Appendable append(CharSequence csq) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(CharSequence csq, int start, int end) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appendable append(char c) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
