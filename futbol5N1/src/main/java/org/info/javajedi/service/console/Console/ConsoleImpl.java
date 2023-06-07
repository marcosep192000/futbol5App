package org.info.javajedi.service.console.Console;

import org.info.javajedi.service.console.IConsoleService;

import java.util.Scanner;

public class ConsoleImpl implements IConsoleService {
	public static  Scanner scanner;
	@Override
	public void create() {
		if (scanner == null)
		{
			scanner = new Scanner(System.in);
		}
	}
	@Override
	public Scanner getScanner() {
		if (scanner != null){
			scanner = new Scanner(System.in);
	}
		return scanner;
	}
	@Override
	public void close() {
		scanner.close();
	}
}
