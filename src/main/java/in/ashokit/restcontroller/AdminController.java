package in.ashokit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.CaseWorkerAccount;
import in.ashokit.service.AdminServiceImp;
import in.ashokit.util.EmailUtils;

@RestController
public class AdminController {

	@Autowired
	private AdminServiceImp adminservice;

	@PostMapping("/createAc")
	public String createCaseWorkerAccount(@RequestBody CaseWorkerAccount caseworkeraccount) {
		String caseworkeraccountcreate = adminservice.createAccountCaseWorker(caseworkeraccount);
		
		/*String fileName = "RECOVER-PASSWORD-EMAIL-BODY.txt";
		String body = readMailBodyContent(fileName, entity);
		String subject = "Recovery Password -Ashok IT";
		boolean isSent = EmailUtils.sendEmail(email, subject, body);
		if (isSent) {
			return "Password sent to register email";
		}
*/
		return "account is created";
	}

	@GetMapping("/delete/{acId}")
	public String deleteCaseWorkerAccount(@PathVariable("acId") Integer accId) {

		adminservice.deleteAccountCaseWorker(accId);
		return "case worker account is deleted " + accId;

	}

	@GetMapping("/getAccount/{AccId}")
	public String getAccountOfCaseWorker(@PathVariable("AccId") Integer AccId) {
		String accountCaseWorker = adminservice.getAccountCaseWorker(AccId);

		return "caseworker account is get" + accountCaseWorker;

	}

	@GetMapping("/getAllCaseWorkerAccounts")
	public String getAllAccountOfCaseWorker() {

		String allAccountCaseWorker = adminservice.getAllAccountCaseWorker();
		return "get all account Case  wORKER" + allAccountCaseWorker;

	}
	@GetMapping("/edit")
	public CaseWorkerAccount editCaseWorkerAccounts(Integer AccId) {
		return null;
		
	}
	

}
