package aula3;

import java.io.IOException;

public class TestaRuntime {
	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("dir");
	}
}
