package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test {
	void get()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter: ");
		String s;
		try {
			FileOutputStream out = new FileOutputStream("xyz.txt");
			String lineSeparator = System.getProperty("line.separator");
			while(!((s=sc.nextLine()).equals("")))
			{
				byte b[]=s.getBytes();
				out.write(b);
				out.write(lineSeparator.getBytes());
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void read()
	{
		try {
			FileInputStream fin= new FileInputStream("xyz.txt");
			int i;
			int count=0,co=0,c=0;
			while((i=fin.read())!=-1)
			{
				if((char)i=='\n')
				{
					count++;
					co++;
					c=c-2;
				}
				if((char)i==' ')
				{
					co++;
				}
				c++;
			}
			System.out.println("no of lines: "+count);
			System.out.println("no of words: "+co);
			System.out.println("no of char: "+c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test t = new test();
		t.get();
		t.read();
	}

}
