package utilidades;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

public class IntTeslink {
 
	public static String key = "a179a17f3d1bf8bac6a1913d0ca2f73e";
	public static String url = "http://localhost/testlink-1.9.0/lib/api/xmlrpc.php";
	
	public void resultado(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException {
	TestLinkAPIClient api=new TestLinkAPIClient(key, url);
		api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
	
	}

}
