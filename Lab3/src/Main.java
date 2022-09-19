import java.util.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class Main {
	protected static File wd ;
	
	static String[] inputStringList;
	
	public static void main(String[] args) {
		wd = new File(System.getProperty("user.dir"));
		
		String tmpInput;
		Scanner scan =new Scanner(System.in);
		while(true) {
		System.out.println("\nWaiting for next command ("+wd.getAbsolutePath()+")");
		tmpInput=scan.nextLine();
		inputStringList = tmpInput.split(" ");
		
		//check input with commands
		if(inputStringList[0].equals("exit")) {
			scan.close();
			System.exit(0);
		}
		else if(inputStringList[0].equals("pwd")) {
				pwd();
		}
		else if(inputStringList[0].equals("ls")){
				ls(inputStringList);
		}
		else if(inputStringList[0].equals("cd")) {
				cd(inputStringList);
			
		}
		else if(inputStringList[0].equals("mkdir")) {
			mkdir(inputStringList);
		
		}
		}
		
	}
	
	protected static void pwd() {
		File[] fileList = wd.listFiles();
		try {
		System.out.println(wd.getCanonicalPath() +"\n"+"Number of files: " + fileList.length);
		}
		catch(Exception e){}
	}
	
	protected static void cd(String[] cmd) {
		if(cmd[1].equals("..")) {
			wd = wd.getParentFile();
		} else {	
			File tmpWD = new File(wd, cmd[1]);
				if(tmpWD.canExecute()) {
					wd = tmpWD;
				} else {
					System.out.println("No file found, such as "+cmd[1]);
				}
		}
	}
	
	protected static void ls(String[] cmd) {
	System.out.println(wd.getAbsolutePath());
	String[] file = wd.list();
	for(String fileName : file) {
		System.out.println(fileName);
	}

	}
	
	protected static void mkdir(String[] cmd) {
		File tmpWD = new File(wd, cmd[1]);
		tmpWD.mkdir();
	}
	
	protected static void cp(String[] cmd) {
		File source = new File(wd, cmd[1]);
		File dest = new File(wd, cmd[2]);
		  InputStream is = null;
		  OutputStream os = null;
		  byte[] buffer = new byte[1024];
		  int length;
		  try {
			  is = new FileInputStream(source);
		      os = new FileOutputStream(dest);
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	        is.close();
	        os.close();
		  }
		  catch(Exception e) {}
	}
	
	protected void head(String[] cmd) {}
	
	
}
