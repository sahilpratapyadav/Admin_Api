package in.ashokit.service;

import in.ashokit.binding.CaseWorker;
import in.ashokit.entity.CaseWorkerAccount;

public interface Adminservice {

	public String createAccountCaseWorker(CaseWorkerAccount caseworkerAccount);

	public String deleteAccountCaseWorker(Integer AccId);

	public String getAccountCaseWorker(Integer AccId);

	public String getAllAccountCaseWorker();

	public CaseWorkerAccount editCaseWorkertAccounts(Integer AccId);

}
