package pages;

import java.io.File;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;

public class Email {

	public static void main(String[] args) {
 
		// Create object of Property file
		Properties props = new Properties();

		// this will set host of server- you can change based on your requirement 
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set the port of socket factory 
		props.put("mail.smtp.socketFactory.port", "465");

		// set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

		// set the authentication to true
		props.put("mail.smtp.auth", "true");

		// set the port of SMTP server
		props.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication("khansamuel678@gmail.com", "Sam123@W");

					}

				});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			// Set the from address
			message.setFrom(new InternetAddress("khansamuel678@gmail.com"));

			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("khansamuel678@gmail.com"));
            
                        // Add the subject link
			message.setSubject("ReactSite: Sign In Test Report");

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("All Passed 10 by 10 and working fine");

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			MimeBodyPart messageBodyPart3 = new MimeBodyPart();

			// Mention the file which you want to send
			String name = "Extent Report Results.html";
			   File filename = new File("C:\\Users\\Win10\\git\\ExtentReportsExample-master\\ExtentReports\\ExtentReportResults.html");
			   String name1 = "Index.png";
			   File filename1 = new File("E:\\images\\Index.png");
		
			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);
		    DataSource source1 = new FileDataSource(filename1);

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart3.setDataHandler(new DataHandler(source1));



			// set the file
			messageBodyPart2.setFileName(name);
            messageBodyPart3.setFileName(name1);


			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

			// add body part 1
			multipart.addBodyPart(messageBodyPart2);

			// add body part 2
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart3);

			// set the content
			message.setContent(multipart);

			// finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}

}