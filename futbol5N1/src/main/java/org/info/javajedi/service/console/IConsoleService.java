package org.info.javajedi.service.console;

import java.util.Scanner;

public interface IConsoleService {
	void  create();
	Scanner getScanner();
	void close();

}
