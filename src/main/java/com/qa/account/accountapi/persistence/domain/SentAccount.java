package com.qa.account.accountapi.persistence.domain;

public class SentAccount {

	private Long accountId;
	private String password;
	private String fullName;
	private String email;
	private Boolean playing;
	

	public SentAccount() {
		//Empty constructor
	}

	public SentAccount(Account account) {
		this.setAccountId(account.getAccountId());
		this.setFullName(account.getFullName());
		this.setEmail(account.getEmail());
		this.setPlaying(account.getPlaying());
		this.setPassword(account.getPassword());

	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	

}