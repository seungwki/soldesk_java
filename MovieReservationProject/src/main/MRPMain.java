package main;

import frame.FrameBase;
import frame.FrameBegin;

public class MRPMain {
	public static void main(String[] args) {
		FrameBase.getInstance(new FrameBegin());
	}
}