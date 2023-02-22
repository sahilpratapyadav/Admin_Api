package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.CaseWorkerCreateAccounts;
import in.ashokit.entity.CaseWorkerAccount;

public interface Adminservice {

	public String createAccountCaseWorker(CaseWorkerCreateAccounts caseworkerAccounts);

	public String deleteAccountCaseWorker(Integer AccId);

	public String getAccountCaseWorker(Integer AccId);

	public List<CaseWorkerAccount> getAllAccountCaseWorker();

	public CaseWorkerAccount editCaseWorkertAccounts(Integer AccId);
	
	
	

}
