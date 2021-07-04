import java.io.*;

class goldberg
{
	public static void main(String args[])throws Exception
	{
		
		Runtime rt = Runtime.getRuntime();
		
		
		Process pcs = rt.exec("cmd /c mkdir hello",null, new File("F:\\Avi\\Java\\goldberg"));
		
		
		
		Thread.sleep(1000);
		
		File f=new File("F:\\Avi\\Java\\goldberg\\hello\\helloworld.cpp");
		
		if(!f.exists())
		f.createNewFile();
		
		FileWriter fw=new FileWriter("F:\\Avi\\Java\\goldberg\\hello\\helloworld.cpp");

		fw.write("	#include \"iostream\" \n	using namespace std; \n	int main()\n	{\n	cout<<\"Hello World\\n\";\n	return 0;\n	}\n	");

		fw.close();
				

		pcs = rt.exec("cmd /c g++ -ohelloWorld helloWorld.cpp", null, new File("F:\\Avi\\Java\\goldberg\\hello"));
		
		Thread.sleep(1000);
		
		pcs = rt.exec("cmd /c helloWorld.exe", null, new File("F:\\Avi\\Java\\goldberg\\hello"));
		
		
		
		printRes(pcs);
		
		
		String lines[]={" __    __            __  __                       __       __                      __        __ ", "/  |  /  |          /  |/  |                     /  |  _  /  |                    /  |      /  |", "$$ |  $$ |  ______  $$ |$$ |  ______             $$ | / \\ $$ |  ______    ______  $$ |  ____$$ |", "$$ |__$$ | /      \\ $$ |$$ | /      \\            $$ |/$  \\$$ | /      \\  /      \\ $$ | /    $$ |", "$$    $$ |/$$$$$$  |$$ |$$ |/$$$$$$  |           $$ /$$$  $$ |/$$$$$$  |/$$$$$$  |$$ |/$$$$$$$ |", "$$$$$$$$ |$$    $$ |$$ |$$ |$$ |  $$ |           $$ $$/$$ $$ |$$ |  $$ |$$ |  $$/ $$ |$$ |  $$ |", "$$ |  $$ |$$$$$$$$/ $$ |$$ |$$ \\__$$ |           $$$$/  $$$$ |$$ \\__$$ |$$ |      $$ |$$ \\__$$ |", "$$ |  $$ |$$       |$$ |$$ |$$    $$/            $$$/    $$$ |$$    $$/ $$ |      $$ |$$    $$ |", "$$/   $$/  $$$$$$$/ $$/ $$/  $$$$$$/             $$/      $$/  $$$$$$/  $$/       $$/  $$$$$$$/ "};
		
		for(String g:lines)
		System.out.println(g);
	
		
		

	}
	
	
	
	static void printRes(Process process) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line = "";
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
	}


}





/*



import java.io.*;

class goldberg
{
	public static void main(String args[])throws Exception
	{
		
		Runtime rt = Runtime.getRuntime();
		
		//rt.exec(new String[]{"F:/Avi/Java/goldberg/gcc -otest test.c","/c","start"});
		
		Process pcs = rt.exec("cmd /c mkdir hello",null, new File("F:\\Avi\\Java\\goldberg"));
		
		
		
		Thread.sleep(1000);
		
		File f=new File("F:\\Avi\\Java\\goldberg\\hello\\helloworld.cpp");
		
		if(!f.exists())
		f.createNewFile();
		
		FileWriter fw=new FileWriter("F:\\Avi\\Java\\goldberg\\hello\\helloworld.cpp");

		fw.write("	#include \"iostream\" \n	using namespace std; \n	int main()\n	{\n	cout<<\"Hello World\\n\";\n	string lines[]={\" __    __            __  __                       __       __                      __        __ \", \"/  |  /  |          /  |/  |                     /  |  _  /  |                    /  |      /  |\", \"$$ |  $$ |  ______  $$ |$$ |  ______              $$ | / \\ $$ |  ______    ______  $$ |  ____$$ |\", \"$$ |__$$ | /       \\  $$ |$$ | /      \\           $$ |/$  \\$$ | /      \\  /      \\ $$ | /    $$ |\", \"$$    $$ |/$$$$$$  |$$ |$$ |/$$$$$$  |           $$ /$$$  $$ |/$$$$$$  |/$$$$$$  |$$ |/$$$$$$$ |\", \"$$$$$$$$ |$$    $$ |$$ |$$ |$$ |  $$ |           $$ $$/$$ $$ |$$ |  $$ |$$ |  $$/ $$ |$$ |  $$ |\", \"$$ |  $$ |$$$$$$$$/ $$ |$$ |$$ \\__$$ |           $$$$/  $$$$ |$$ \\__$$ |$$ |      $$ |$$ \\__$$ |\", \"$$ |  $$ |$$       |$$ |$$ |$$    $$/            $$$/    $$$ |$$    $$/ $$ |      $$ |$$    $$ |\", \"$$/   $$/  $$$$$$$/ $$/ $$/  $$$$$$/             $$/      $$/  $$$$$$/  $$/       $$/  $$$$$$$/ \"};\n	for(int i=0;i<9;i++)	 \n	cout<<lines[i]<<\"\\n\";	\nreturn 0;\n	}\n	");

		fw.close();
				

		pcs = rt.exec("cmd /c g++ -ohelloWorld helloWorld.cpp", null, new File("F:\\Avi\\Java\\goldberg\\hello"));
		
		Thread.sleep(1000);
		
		pcs = rt.exec("cmd /c helloWorld.exe", null, new File("F:\\Avi\\Java\\goldberg\\hello"));
		
		Thread.sleep(1000);
		
		printRes(pcs);
		
		
	

	}
	
	
	
	static void printRes(Process process) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String line = "";
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
	}


}
*/



//   __    __            __  __                       __       __                      __        __ 
//  /  |  /  |          /  |/  |                     /  |  _  /  |                    /  |      /  |
//  $$ |  $$ |  ______  $$ |$$ |  ______             $$ | / \ $$ |  ______    ______  $$ |  ____$$ |
//  $$ |__$$ | /      \ $$ |$$ | /      \            $$ |/$  \$$ | /      \  /      \ $$ | /    $$ |
//  $$    $$ |/$$$$$$  |$$ |$$ |/$$$$$$  |           $$ /$$$  $$ |/$$$$$$  |/$$$$$$  |$$ |/$$$$$$$ |
//  $$$$$$$$ |$$    $$ |$$ |$$ |$$ |  $$ |           $$ $$/$$ $$ |$$ |  $$ |$$ |  $$/ $$ |$$ |  $$ |
//  $$ |  $$ |$$$$$$$$/ $$ |$$ |$$ \__$$ |           $$$$/  $$$$ |$$ \__$$ |$$ |      $$ |$$ \__$$ |
//  $$ |  $$ |$$       |$$ |$$ |$$    $$/            $$$/    $$$ |$$    $$/ $$ |      $$ |$$    $$ |
//  $$/   $$/  $$$$$$$/ $$/ $$/  $$$$$$/             $$/      $$/  $$$$$$/  $$/       $$/  $$$$$$$/ 
                                                                                                  