package in.ashokit.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.CaseWorkerAccount;
import in.ashokit.repository.CaseWorkerAccountRepository;
import in.ashokit.util.EmailUtils;

@Service
public class AdminServiceImp implements Adminservice {

	@Autowired
	private CaseWorkerAccountRepository caseworkerrepo;
	@Autowired
	private EmailUtils emailutils;

	@Override
	public String createAccountCaseWorker(CaseWorkerAccount caseworkerAccount) {

		CaseWorkerAccount entity = caseworkerrepo.save(caseworkerAccount);
		String email = caseworkerAccount.getEmail();
		String subject = "User Registration AshokIT";
		String filename = "UNLOCK-ACC-EMAIL-BODY-TEMPLATE.txt";
		String body = readMailBodyContent(filename, entity);
		boolean isSent = EmailUtils.sendEmail(email, subject, body);

		if (entity.getAccId() != null && isSent) {
			return "success  Account is created  CaseWorker";
		} else {
			return "fail";
		}

		// TODO Auto-generated method stub
		//return "Account is created  CaseWorker";
	}
	
	
	private String readMailBodyContent(String fileName, CaseWorkerAccount entity) {
		String mailBody = "";
		try {
			StringBuilder sb = new StringBuilder();
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();// reading first line data
			while (line != null) {
				sb.append(line);// append line data to buffer obj
				line = br.readLine(); // readlin next line data

			}

			mailBody = sb.toString();
			/*mailBody = mailBody.replace("{FNAME}", entity.getFirstName());
			mailBody = mailBody.replace("{LNAME}", entity.getLastName());
			mailBody = mailBody.replace("{TEMP-PWD}", entity.getPazzword());
			mailBody = mailBody.replace("{EMAIL}", entity.getEmail());
			mailBody = mailBody.replace("{PWD}", entity.getPazzword());*/
			fr.close();
			br.close();

		} catch (Exception e) {

			//logger.info("errro catch here", e);
			System.out.println(e.getMessage());

		}

		return mailBody;

	}

	@Override
	public String deleteAccountCaseWorker(Integer AccId) {

		caseworkerrepo.deleteById(AccId);
		// TODO Auto-generated method stub
		return "caseWorker Account is deleted " + AccId;
	}

	@Override
	public String getAccountCaseWorker(Integer AccId) {

		Optional<CaseWorkerAccount> findById = caseworkerrepo.findById(AccId);
		
		// TODO Auto-generated method stub
		return "caseworker account is getting"+findById;
	}

	@Override
	public String getAllAccountCaseWorker() {
		// TODO Auto-generated method stub
		List<CaseWorkerAccount> findAll = caseworkerrepo.findAll();
		return "get casework account"+findAll;
	}

	@Override
	public CaseWorkerAccount editCaseWorkertAccounts(Integer AccId) {
		// TODO Auto-generated method stub
		return null;
	}

}
