package design_patterns.structural.decorator;

import design_patterns.structural.decorator.decorators.CompressionDecorator;
import design_patterns.structural.decorator.decorators.DataSource;
import design_patterns.structural.decorator.decorators.DataSourceDecorator;
import design_patterns.structural.decorator.decorators.EncryptionDecorator;
import design_patterns.structural.decorator.decorators.FileDataSource;

public class Main {
	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		DataSourceDecorator encoded = new CompressionDecorator(
				new EncryptionDecorator(new FileDataSource("OutputDemo.txt")));
		encoded.writeData(salaryRecords);
		DataSource plain = new FileDataSource("OutputDemo.txt");

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}
}
