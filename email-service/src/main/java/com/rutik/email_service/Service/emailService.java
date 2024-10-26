package com.rutik.email_service.Service;

import java.io.File;

public interface emailService {

	//Send Email To the Single Person
	
	void sentEmail(String to , String subject , String message);
	
	//send Email to the multiple account
	
	void sentEmail(String [] to ,String subject , String message); 
	
	//send email with html code
	void sentEmailWithHtml(String to , String subject , String htmlContent );
	
	//send email with file attachment 
	void sentEmail(String to , String subject , String message , File file);

}
