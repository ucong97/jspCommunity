package com.sbs.example.jspCommunity.service;

import com.sbs.example.util.Util;

public class EmailService {
	private String gmailId;
	private String gmailPw;
	private String from;
	private String fromName;

	public void init(String gmailId, String gmailPw, String from, String fromName) {
		this.gmailId = gmailId;
		this.gmailPw = gmailPw;
		this.from = from;
		this.fromName = fromName;

		System.out.println("실행잘됨");
		System.out.println(gmailId);
		System.out.println(gmailPw);
	}

	public int send(String to, String title, String body) {
		return Util.send(gmailId, gmailPw, from, fromName, to, title, body);
	}
}
